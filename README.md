# Clona o projeto
git clone https://github.com/DaviGayDaSilva/Servidor-De-Minecraft-Java-Editiok-Para-Termux
cd Servidor-De-Minecraft-Java-Edition

# Dá permissão pro Gradle wrapper (se necessário)
chmod +x gradlew

# Baixa as libs e compila tudo
./gradlew build

# Roda o servidor
./gradlew run

# ⚠️ Aviso
Este Servidor é Experimental, sem mundo padrão e sem mobs. É mais pra projetos custom, testes, bots, etc. Se Tu quiser algo igual ao minecraft vanilla, usa PaperMC ou purpur
