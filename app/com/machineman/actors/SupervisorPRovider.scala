package com.machineman.actors

import akka.actor.typed.ActorSystem
import akka.stream.Materializer
import com.typesafe.config.ConfigFactory

import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext

@Singleton
class SupervisorPRovider @Inject() (materializer : Materializer)(implicit  ec : ExecutionContext) {
//  akka.remote.artery.canonical.port = 2558

  val config = ConfigFactory.parseString(
    s"""
       |""".stripMargin
  ).withFallback(ConfigFactory.load("akka.conf"))
  lazy val actorSystem  = ActorSystem(Supervisor(), "application", config)
  println("Coming here")
}
