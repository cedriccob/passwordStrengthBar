package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import static play.data.Form.form;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(FAKE_FORM));
    }

    public static final Form FAKE_FORM = form();
}
