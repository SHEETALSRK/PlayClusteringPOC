package com.machineman.actors

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors
import com.machineman.commands.{Data, DataBehavior}

object ProcessingActor {

  def apply(entityId : String) : Behavior[DataBehavior] = Behaviors.receiveMessage {
    msg => msg match {
      case Data(msg,id) =>
        println("new message")
        println(s"Message received by Processing actor $msg with entity ID $entityId")
        //        replyTo ! Replied
        Behaviors.same
    }
  }
}

