import net.minestom.server.MinecraftServer;
import net.minestom.server.event.player.PlayerLoginEvent;
import net.minestom.server.event.GlobalEventHandler;

public class Main {
    public static void main(String[] args) {
        MinecraftServer server = MinecraftServer.init();

        GlobalEventHandler eventHandler = MinecraftServer.getGlobalEventHandler();

        eventHandler.addListener(PlayerLoginEvent.class, event -> {
            System.out.println(event.getPlayer().getUsername() + " entrou no servidor!");
        });

        server.start("0.0.0.0", 25565);
        System.out.println("Servidor Minestom rodando na porta 25565");
    }
}
