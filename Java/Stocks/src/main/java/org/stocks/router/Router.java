package org.stocks.router;
import com.google.inject.Inject;
import io.javalin.Javalin;
import io.javalin.http.HttpStatus;
import org.stocks.controller.PingController;
import org.stocks.controller.StockController;

import static io.javalin.apibuilder.ApiBuilder.path;
import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.post;

public class Router {

    @Inject
    private final StockController stockController = new StockController();

    public void mainRouter() {
        Javalin app = Javalin.create();
        setupEndpoints(app);
        app.start(8080);
    }

    private void setupEndpoints(final Javalin app) {
        app.routes(() -> {
            path("/stocks", () -> {
                post("/mystocks", ctx -> {
                    ctx.json(stockController.getStocks(ctx));
                });
            });
        });
    }

    private void ping() {
        get("/ping", ctx -> {
            ctx.status(HttpStatus.OK);
            ctx.json(PingController.getPing());
        });
    }

}
