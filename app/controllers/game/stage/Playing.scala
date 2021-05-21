package controllers.game.stage
import models.User
import models.game.{GameError, Message, Player, State}
import play.api.libs.json.{Format, Json}

case class Playing(currentPlayer: Int, played: Int, needToPlay: Int) extends PlayerStage(currentPlayer) {
  override def receive(message: Message, user: User, state: State): Either[GameError, State] = ???

  override def currentPlayer(state: State): Option[Player] = state.players.find(p => p.userId == currentPlayer)
}

object Playing {
  implicit val format: Format[Playing] = Json.format
}