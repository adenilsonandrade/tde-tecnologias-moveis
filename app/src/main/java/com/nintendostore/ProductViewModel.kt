package com.nintendostore

import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {

    val listaDeProdutos = mutableListOf(
        Product(
            urlImage = "https://upload.wikimedia.org/wikipedia/pt/thumb/0/06/Super-Mario-World.jpg/270px-Super-Mario-World.jpg",
            name = "Super Mario World",
            gender = "Plataforma",
            launch = "1994",
            price = "68.00",
            description = "Super Mario World, originalmente chamado no Japão de Super Mario Bros é um jogo eletrônico de plataforma desenvolvido pela Nintendo" +
                    " Entertainment Analysis & Development e publicado pela Nintendo, em 1990, para o console Super Nintendo Entertainment System (SNES)." +
                    " A história segue a jornada de Mario para salvar a Princesa Toadstool e a Dinosaur Land do antagonista Bowser e de seus capangas," +
                    " os Koopalings. A jogabilidade é semelhante à dos jogos anteriores da série Super Mario: os jogadores controlam Mario ou seu irmão Luigi" +
                    " através de uma série de fases, cujo objetivo é alcançar um portão gigante em seu final. Super Mario World introduz Yoshi, um dinossauro" +
                    " que pode comer inimigos, bem como ganhar habilidades comendo cascas de Koopa Troopas. O desenvolvimento de Super Mario World foi liderado" +
                    " pelo diretor Takashi Tezuka e pelo produtor e criador da série, Shigeru Miyamoto. É o primeiro jogo da franquia Mario desenvolvido" +
                    " especificamente para o SNES, e foi idealizado para aproveitar ao máximo as características técnicas do console. A equipe de desenvolvimento" +
                    " teve mais liberdade, em comparação com as versões da série para o Nintendo Entertainment System (NES). Yoshi foi concebido desde o primeiro" +
                    " Super Mario Bros., mas não foi usado até o lançamento de Super Mario World devido à limitações do NES. A trilha sonora do jogo foi composta" +
                    " por Koji Kondo, que trabalhou em melodias semelhantes, porém mais variadas, para diferenciá-lo de seus antecessores.",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://upload.wikimedia.org/wikipedia/pt/thumb/8/83/Donkey_Kong_Country_capa.png/270px-Donkey_Kong_Country_capa.png",
            name = "Donkey Kong Counstry",
            gender = "Plataforma",
            launch = "1994",
            price = "79.00",
            description = "Donkey Kong Country é um jogo de plataforma de 1994 desenvolvido pela Rare e publicado pela" +
                    " Nintendo para o Super Nintendo Entertainment System (SNES). É uma reinicialização da franquia Donkey Kong da Nintendo e segue o gorila Donkey" +
                    " Kong e seu sobrinho Diddy Kong enquanto eles partem para recuperar seu tesouro de bananas roubado do crocodilo King K. Rool e seu exército," +
                    " os Kremlings . O modo single-player percorre 40 níveis de rolagem lateral enquanto salta entre plataformas e evita obstáculos. Eles coletam" +
                    " itens, andam em minecarts e animais, derrotam inimigos e chefes e encontram fases bônus secretas. Nos modos multijogador, dois jogadores" +
                    " trabalham cooperativamente ou competem entre si.\n" +
                    "Este foi o primeiro jogo Donkey Kong a não ser produzido e nem dirigido por Shigeru Miyamoto, o criador do personagem; ao invés, o jogo foi" +
                    " produzido por Tim Stamper e Gregg Mayles, embora Miyamoto ainda estivesse envolvido no projeto.[1] Donkey Kong Country foi posteriormente" +
                    " adaptado ao Game Boy Color em 2000 e ao Game Boy Advance em 2003. Além disso, o jogo foi disponibilizado para download no Virtual Console" +
                    " do Wii em 2006, do Wii U em 2014 e do New Nintendo 3DS em 2016 com um modo de pixel perfeito.",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/d2/44/09/d24409afa17ba61bac510807ae637042.jpg",
            name = "Donkey Kong Country 2: Diddy's Kong Quest",
            gender = "Plataforma",
            launch = "1995",
            price = "59.00",
            description = "Donkey Kong Country 2: Diddy's Kong Quest[b] is a 1995 platform game developed by Rare and published by Nintendo for the Super Nintendo" +
                    " Entertainment System (SNES). It was released on 21 November 1995 in Japan, 4 December in North America, and 14 December in Europe. It is the" +
                    " second installment of the Donkey Kong Country series and the sequel to Donkey Kong Country (1994).\n" +
                    "Players control Diddy Kong and his girlfriend Dixie Kong, who must rescue Donkey Kong after he is kidnapped by King K. Rool. The game is" +
                    " set on Crocodile Isle, with eight worlds of varying environments, totaling 52 levels. The game uses the same Silicon Graphics (SGI)" +
                    " technology from the original, which features the use of pre-rendered 3D imagery.\n" +
                    "Diddy's Kong Quest received acclaim, being widely regarded as one of the greatest 2D platformers ever made. Praise was directed at its graphics," +
                    " gameplay, and soundtrack. It was the second-bestselling game of 1995, and the sixth-bestselling game on the SNES.",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/aa/65/fe/aa65fe62fd81ff735f05342dca8cdaef.jpg",
            name = "Street Fighter II",
            gender = "Luta",
            launch = "1987",
            price = "47.00",
            description = "Street Fighter II: The World Warrior também conhecido simplesmente por Street Fighter II, é um jogo competitivo de videogame desenvolvido" +
                    " pela Capcom e originalmente lançado para os sistemas de Arcade em 1991. É o segundo jogo da série Street Fighter e a sequência de Street Fighter," +
                    " jogo lançado em 1987. Trata-se do décimo quarto título da Capcom a utilizar a placa de sistema de Arcade CP System. Street Fighter II melhorou" +
                    " vários dos conceitos introduzidos no primeiro jogo, incluindo o uso de golpes especiais baseados em comandos e uma configuração de Joystick" +
                    " com seis botões, enquanto ofereceu aos jogadores uma seleção maior de personagens jogáveis, cada um com seu próprio estilo de luta, e introduziu" +
                    " o sistema de Combos.\n" +
                    "Street Fighter II se tornou o título mais vendido desde a era de ouro dos jogos de Arcade. Em 1994, o jogo tinha sido jogado por mais de 25" +
                    " milhões de pessoas somente nos Estados Unidos, em casa e nos Arcades. Devido ao sucesso, uma série de versões atualizadas oferecendo recursos" +
                    " e personagens adicionais foi lançada. Todas as versões de Street Fighter II venderam mais de 200 mil gabinetes de Arcade e mais de 15 milhões" +
                    " de unidades de Software por todo o mundo, e estima-se que elas tenham lucrado mais de 10 bilhões de dólares em vendas totais, fazendo do jogo" +
                    " um dos três jogos mais lucrativos de todos os tempos até 2017, e o jogo de luta mais vendido até 2019. A versão de Super Nintendo de Street" +
                    " Fighter II vendeu mais de 6.3 milhões de cartuchos, fazendo dela o título mais vendido da Capcom pelas próximas duas décadas e seu jogo" +
                    " mais vendido em uma só plataforma.\n" +
                    "Street Fighter II é reconhecido como um dos melhores jogos eletrônicos de sempre, e em particular o mais importante e influente jogo" +
                    " de luta já criado. Seu lançamento é visto como um momento revolucionário no seu gênero, e são creditados a ele a popularização de jogos" +
                    " de luta durante os anos 90, incitando outros produtores a criarem as suas próprias séries. Despoletou um renascimento dentro da indústria," +
                    " criando um enorme impacto nos jogos competitivos, na cultura popular assim como música e filmes.",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/originals/41/1e/aa/411eaa42fde661b74b3c541092991b17.jpg",
            name = "Killer Instinct",
            gender = "Luta",
            launch = "1994",
            price = "73.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/a0/a5/be/a0a5be916e29479d3ade140206a20642.jpg",
            name = "Goof Troop",
            gender = "Ação-aventura, Puzzle",
            launch = "1992",
            price = "42.00",
            description = "",
            console = "superNintendo"
        ),
        Product(
            urlImage = "https://i.pinimg.com/564x/da/64/a3/da64a3a0a2be8c480e712a77f26ffa43.jpg",
            name = "Aladdin",
            gender = "Ação, Plataforma",
            launch = "1993",
            price = "39.00",
            description = "",
            console = "superNintendo"
        ),
        Product(
            urlImage = "https://i.pinimg.com/564x/05/c8/c7/05c8c707cf5a4dbd042dcfe084fbfff6.jpg",
            name = "Star Fox",
            gender = "Ação, Aventura",
            launch = "1993",
            price = "84.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/87/68/c9/8768c94b4f3be4c2606a37381ee50141.jpg",
            name = "F-Zero",
            gender = "Corrida",
            launch = "1992",
            price = "52.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/25/56/87/25568792b4ff7078960aea7d9946ee7d.jpg",
            name = "Top Gear",
            gender = "Corrida",
            launch = "1992",
            price = "46.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/bd/fe/32/bdfe320f54551ca9bb7e1d0d93e473c5.jpg",
            name = "Batman Forever",
            gender = "Ação-Aventura",
            launch = "1996",
            price = "57.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/01/cd/d2/01cdd29797d7a58e6d3b02ac77354156.jpg",
            name = "Super Metroid",
            gender = "Ação-Aventura",
            launch = "1994",
            price = "51.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/63/3d/1a/633d1aecb4edee32e0d0f04c76f3ea66.jpg",
            name = "International Super Star Soccer Deluxe",
            gender = "Futebol",
            launch = "1997",
            price = "49.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/91/89/36/9189362fe3bb58e21fec8830934edc16.jpg",
            name = "Ultimate Mortal Kombat 3",
            gender = "Luta",
            launch = "1995",
            price = "64.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/da/ff/cf/daffcfe4d2bfac3ce32cea1a1f0aba26.jpg",
            name = "Super Mario Kart",
            gender = "Corrida",
            launch = "1992",
            price = "45.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/3b/f0/2e/3bf02e5fe6fc7ddb9e9bf7e9ac5f6bca.jpg",
            name = "Final Fantasy III",
            gender = "RPG",
            launch = "1992",
            price = "79.00",
            description = "",
            console = "superNintendo"
        ),

        Product(
            urlImage = "https://i.pinimg.com/564x/33/6d/15/336d1502836027db07897325e18ce458.jpg",
            name = "Chrono Trigger",
            gender = "RPG",
            launch = "1995",
            price = "73.00",
            description = "",
            console = "superNintendo"
        )
    )

    fun getProducts() = listaDeProdutos
}