package com.machineman.modules

import com.google.inject.AbstractModule
import com.machineman.actors.Supervision

class Injection extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[Supervision]).asEagerSingleton()
//    bind(classOf[ClusterSharding]).asEagerSingleton()
  }
}
