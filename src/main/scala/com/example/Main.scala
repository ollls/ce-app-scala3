package com.example

import cats.effect.{IO, IOApp, ExitCode}
import org.typelevel.log4cats.Logger
import com.example.Logger._

object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    for {
       _ <- IO.println("*&")
       _ <- Logger[IO].debug("2")
    } yield (ExitCode.Success)
}
