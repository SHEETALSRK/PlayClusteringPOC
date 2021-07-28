package com.machineman.actors

import akka.stream.Materializer

import javax.inject.{Inject, Singleton}

@Singleton
final class Supervision @Inject()(materializer : Materializer){
//  lazy val actorSystem  = ActorSystem(Supervisor(), "Machineman", ConfigFactory.load("application.conf"))
//  lazy val actorSystem = materializer.system.a
  println("Coming here")
  val logger = play.api.Logger(this.getClass)
  logger.info("INFO- starting up the project")
  logger.debug("DEBUG- starting up the project")
  logger.trace("TRACE- starting up the project")
  logger.warn("WARN- starting up the project")
  logger.error("ERROR- starting up the project")
}
