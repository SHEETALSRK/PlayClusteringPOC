package com.machineman.controllers

import com.machineman.actors.Supervisor.Message
import com.machineman.actors.SupervisorPRovider
import play.api.mvc._

import javax.inject._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents,
                               supervisorProvider : SupervisorPRovider) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
//    supervisorProvider.actorSystem ! Message("Hey", "Hi")
    supervisorProvider.actorSystem ! Message("Hey", "Hi")
    Ok("testing")
  }
}
