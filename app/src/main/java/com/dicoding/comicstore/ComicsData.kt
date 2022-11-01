package com.dicoding.comicstore

object ComicsData {
    private val comicsTitle = arrayOf(
        "Chainsaw Man, Vol. 1",
        "Quintessential Quintuplets, Vol. 9",
        "Jujutsu Kaisen, Vol. 11",
        "Berserk, Vol. 14",
        "One Punch Man, Vol. 21",
        "Rent a Girlfriend, Vol. 9",
        "Demon Slayer: Kimetsu no Yaiba, Vol. 14",
        "One Piece, Vol. 100",
        "Attack on Titan, Vol. 28",
        "Uzumaki",
        "Magi: The Labyrinth of Magic, Vol. 23",
        "School Live!, Vol. 12",
        "Terra Formars, Vol. 16",
        "Tomie",
        "Made in Abyss, Vol. 6"
    )


    private val comicsCover = arrayOf(
        R.drawable.chain_saw_man_1,
        R.drawable.quintessential_quintuplets_9,
        R.drawable.jujutsu_kaisen_11,
        R.drawable.berserk_14,
        R.drawable.one_punch_man_21,
        R.drawable.rent_a_girlfriend_9,
        R.drawable.kimetsu_no_yaiba_14,
        R.drawable.one_piece_100,
        R.drawable.attack_on_titan_28,
        R.drawable.uzumaki,
        R.drawable.magi_23,
        R.drawable.school_live_12,
        R.drawable.terra_formars_16,
        R.drawable.tomie,
        R.drawable.made_in_abyss_6
    )

    private val comicsDescription = arrayOf(
        "Broke young man + chainsaw dog demon = Chainsaw Man!\nDenji was a small-time devil hunter just trying to survive in a harsh world. After being killed on a job, he is revived by his pet devil Pochita and becomes something new and dangerous-Chainsaw Man!\nDenji's a poor young man who'll do anything for money, even hunting down devils with his pet devil-dog Pochita. He's a simple man with simple dreams, drowning under a mountain of debt. But his sad life gets turned upside down one day when he's betrayed by someone he trusts. Now with the power of a devil inside him, Denji's become a whole new man-Chainsaw Man!",
        "Futaro Uesugi is a second-year in high school, scraping to get by and pay off his family's debt. The only thing he can do is study, so when Futaro receives a part-time job offer to tutor the five daughters of a wealthy businessman, he can't pass it up. Little does he know, these five beautiful sisters are quintuplets, but the only thing they have in common is that they're all terrible at studying! At this rate, the sisters can't graduate, and Futaro must think of a plan that suits each of them - which feels hopeless when five-out-of-five of these girls think he's a loser!",
        "Yuji Itadori is resolved to save the world from cursed demons, but he soon learns that the best way to do it is to slowly lose his humanity and become one himself!\nIn a world where demons feed on unsuspecting humans, fragments of the legendary and feared demon Ryoma Sukuna were lost and scattered about. Should any demon consume Sukuna's body parts, the power they gain could destroy the world as we know it. Fortunately, there exists a mysterious school of Jujutsu Sorcerers who exist to protect the precarious existence of the living from the undead!\nYuji Itadori is high schooler who spends his days visiting his bedridden grandfather. Although he looks like your average teenager, his immense physical strength is something to behold! Every sports club wants him to join, but Itadori would rather hang out with the school outcasts in the Occult Club. One day, the club manages to get their hands on a sealed cursed object, but little do they know the terror they'll unleash when they break the seal...",
        "Created by Kentaro Miura, Berserk is manga mayhem to the extreme - violent, horrifying, and mercilessly funny - and the wellspring for the internationally popular anime series. Not for the squeamish or the easily offended, Berserk asks for no quarter - and offers none!\nHis name is Guts, the Black Swordsman, a feared warrior spoken of only in whispers. Bearer of a gigantic sword, an iron hand, and the scars of countless battles and tortures, his flesh is also indelibly marked with The Brand, an unholy symbol that draws the forces of darkness to him and dooms him as their sacrifice. But Guts won't take his fate lying down; he'll cut a crimson swath of carnage through the ranks of the damned - and anyone else foolish enough to oppose him! Accompanied by Puck the Elf, more an annoyance than a companion, Guts relentlessly follows a dark, bloodstained path that leads only to death...or vengeance.",
        "Nothing about Saitama passes the eyeball test when it comes to superheroes, from his lifeless expression to his bald head to his unimpressive physique. However, this average-looking guy has a not-so-average problem - he just can't seem to find an opponent strong enough to take on! Every time a promising villain appears, he beats the snot out of 'em with one punch! Can Saitama finally find an opponent who can go toe-to-toe with him and give his life some meaning? Or is he doomed to a life of superpowered boredom?",
        "You can rent a girlfriend, but can you buy love? Hapless freshman Kazuya, reeling from a bad breakup, buys a few hours at the aquarium with the beautiful, polite Chizuru. But rock bottom might be so much lower than he thought! Family, school, and life all start to go wrong, and to make matters worse, Chizuru is much more than the pretty face and sweet demeanor he thought he'd bargained for! In today's Japan, 'rental' services can deliver an afternoon with a 'friend,' a 'parent,' even a fake girlfriend! After a staggering betrayal by his college girlfriend, Kazuya gets just desperate enough to give it a try. But he quickly discovers how complicated it can be to 'rent' an emotional connection... and his new 'girlfriend,' who's trying to keep her side hustle secret, will panic when she finds out her real life and Kazuya's are intertwined in surprising ways! It's sweet but na-ve boy meets cute but ruthless girl in this 21st-century manga rom-com!",
        "Tanjiro sets out on the path of the Demon Slayer to save his sister and avenge his family! In Taisho-era Japan, Tanjiro Kamado is a kindhearted boy who makes a living selling charcoal. But his peaceful life is shattered when a demon slaughters his entire family. His little sister Nezuko is the only survivor, but she has been transformed into a demon herself! Tanjiro sets out on a dangerous journey to find a way to return his sister to normal and destroy the demon who ruined his life. Learning to slay demons won't be easy, and Tanjiro barely knows where to start. The surprise appearance of another boy named Giyu, who seems to know what's going on, might provide some answers...but only if Tanjiro can stop Giyu from killing his sister first! Action-adventure title similar to InuYasha that pits samurai swords against demons.",
        "Join Monkey D. Luffy and his swashbuckling crew in their search for the ultimate treasure, One Piece!\nAs a child, Monkey D. Luffy dreamed of becoming King of the Pirates. But his life changed when he accidentally gained the power to stretch like rubber...at the cost of never being able to swim again! Years, later, Luffy sets off in search of the One Piece, said to be the greatest treasure in the world...",
        "Several hundred years ago, humans were nearly exterminated by giants. Giants are typically several stories tall, seem to have no intelligence and who devour human beings. A small percentage of humanity survied barricading themselves in a city protected by walls even taller than the biggest of giants. Flash forward to the present and the city has not seen a giant in over 100 years - before teenager Elen and his foster sister Mikasa witness something horrific as the city walls are destroyed by a super-giant that appears from nowhere.",
        "Kurozu-cho, a small fogbound town on the coast of Japan, is cursed. According to Shuichi Saito, the withdrawn boyfriend of teenager Kirie Goshima, their town is haunted not by a person or being but by a pattern: uzumaki, the spiral, the hypnotic secret shape of the world. It manifests itself in everything from seashells and whirlpools in water to the spiral marks on people's bodies, the insane obsessions of Shuichi's father and the voice from the cochlea in our inner ear. As the madness spreads, the inhabitants of Kurozu-cho are pulled ever deeper into a whirlpool from which there is no return!",
        "Deep within the desert lie the mysterious Dungeons, vast stores of riches there for the taking by anyone lucky enough to find them and brave enough to venture into the depths from where few have ever returned. Plucky young adventurer Aladdin means to find the Dungeons and their secrets, but Aladdin may be just as mysterious as the treasures he seeks. Aladdin tells the story of the fallen Alma Tran. In the distant past, in another world, humanity struggled to survive an onslaught of monsters, but once united against them, human sorcerers became as bad as the enemies they once fought. Solomon himself struggled to lead humanity up out of the darkness it had created, but with every victory comes sacrifice...",
        "Meet the members of the School Living Club! There's the shovel-loving(?) Kurumi Ebisuzawa, the big-sister figure Yuuri Wakasa, club advisor Megumi Sakura, and last but not least, the ever-optimistic Yuki Takeya. The School Living Club is just your average after-school organization where the girls hang out, have fun...and live at school as the sole survivors of a zombie apocalypse. NBD.",
        "In the late 26th century, overpopulation on Earth is reaching the breaking point, and humanity must find new frontiers. The terraforming of Mars has taken centuries but is now complete. The colonization of Mars by humanity is an epoch-making event, but an unintended side effect of the terraforming process unleashes a horror no one could ever have imagined...\nAfter humanity's first manned mission to the Red Planet was lost, a second expedition arrives. The explorers prepare to exterminate the cockroaches that were used to transform the Martian environment. They are shocked to discover that the insects have mutated into giant, aggressive humanoids with one overriding goal - exterminate the humans! But this crew of explorers has each undergone the Bugs Procedure, terrifying experimental surgery designed to make them more than human...",
        "The complete classic horror series, now available in a single deluxe volume. Murdered again and again, one girl always comes back for more... Tomie Kawakami is a femme fatale with long black hair and a beauty mark just under her left eye. She can seduce nearly any man, and drive them to murder as well, even though the victim is often Tomie herself. While one lover seeks to keep her for himself, another grows terrified of the immortal succubus. But soon they realize no matter how many times they kill her, the world will never be free of Tomie.",
        "In an age when the corners of the world have been scoured for their secrets, only one place remains unexplored - a massive cave system known as the Abyss. Those who traverse its endless pits and labyrinth-like tunnels are known as Cave Raiders. A young orphan named Rico dreams of following in her mother's footsteps as a Cave Raider, and when she meets a strange robot when exploring the Abyss, she's one step closer to achieving her goal!"
    )

    private val comicsGenre = arrayOf(
        "Action, Comedy Horror, Dark Fantasy",
        "Harem, Romantic Comedy",
        "Adventure, Dark Fantasy, Supernatural",
        "Dark Fantasy, High Fantasy, Swords and Magic",
        "Action, Comedy, Superhero",
        "Harem, Romantic Comedy",
        "Adventure, Dark Fantasy, Martial Arts",
        "Adventure, Fantasy",
        "Horror, Drama, Dark Fantasy, Adventure, Action, Post-Apocalyptic",
        "Dark Fantasy, Psychological Horror, Supernatural",
        "Adventure, Fantasy",
        "Horror, Psychological Thriller, Slice of Life",
        "Adventure, Horror, Sci-Fi",
        "Psychological Horror, Supernatural",
        "Adventure, Dark Fantasy, Sci-Fi"
    )

    private val comicsAuthor = arrayOf(
        "Tatsuki Fujimoto",
        "Negi Haruba",
        "Gege Akutami",
        "Kentaro Miura",
        "ONE",
        "Reiji Miyajima",
        "Koyoharu Gotouge",
        "Eiichiro Oda",
        "Hajime Isayama",
        "Junji Ito",
        "Shinobu Ohtaka",
        "Norimitsu Kaihou",
        "Yu Sasuga",
        "Junji Ito",
        "Akihito Tsukushi"
    )

    private val comicsPublisher = arrayOf(
        "Viz. Media, Subs. of Shogakukan Inc",
        "Kodansha America, Inc",
        "Viz. Media, Subs. of Shogakukan Inc",
        "Dark Horse Comics, U.S.",
        "Viz. Media, Subs. of Shogakukan Inc",
        "Kodansha America, Inc",
        "Viz. Media, Subs. of Shogakukan Inc",
        "Viz. Media, Subs. of Shogakukan Inc",
        "Kodansha America, Inc",
        "Viz. Media, Subs. of Shogakukan Inc",
        "Viz. Media, Subs. of Shogakukan Inc",
        "Little, Brown & Company",
        "Viz. Media, Subs. of Shogakukan Inc",
        "Viz. Media, Subs. of Shogakukan Inc",
        "Seven Seas Entertainment, LLC"
    )

    private val comicsIsbn = arrayOf(
        "1974709930",
        "1632369206",
        "1974722848",
        "1593075014",
        "197471764X",
        "1646510933",
        "1974711145",
        "1974732177",
        "1632367831",
        "1421561328",
        "1421583992",
        "1975315502",
        "1421590697",
        "1421590565",
        "1642750948"
    )

    private val comicsPages = arrayOf(
        192,
        192,
        192,
        240,
        240,
        208,
        192,
        216,
        192,
        648,
        192,
        176,
        208,
        752,
        180
    )

    private val comicsPublicationDate = arrayOf(
        "29 Oct 2020",
        "14 Jul 2020",
        "16 Sep 2021",
        "19 Dec 2006",
        "29 Oct 2020",
        "05 Oct 2021",
        "23 Jul 2020",
        "01 Sep 2022",
        "15 Aug 2019",
        "21 Nov 2013",
        "20 April 2017",
        "25 Aug 2020",
        "09 Feb 2017",
        "20 Dec 2016",
        "04 Jun 2019"
    )


    val listData: ArrayList<Comic>
        get() {
            val list = arrayListOf<Comic>()
            for (position in comicsTitle.indices) {
                val comic = Comic()
                comic.title = comicsTitle[position]
                comic.cover = comicsCover[position]
                comic.description = comicsDescription[position]
                comic.genre = comicsGenre[position]
                comic.author = comicsAuthor[position]
                comic.publisher = comicsPublisher[position]
                comic.isbn = comicsPublisher[position]
                comic.pages = comicsPages[position]
                comic.publicationDate = comicsPublicationDate[position]
                list.add(comic)
            }
            return list
        }
}