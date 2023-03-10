package com.example

import org.typelevel.log4cats.Logger
import org.typelevel.log4cats.slf4j.Slf4jLogger
import org.typelevel.log4cats.LoggerName
import cats.effect.IO
import cats.effect.Sync

object Logger {
  implicit def loggerIO: Logger[IO] = Slf4jLogger.getLogger[IO](Sync[IO], LoggerName("quartz"))
}
