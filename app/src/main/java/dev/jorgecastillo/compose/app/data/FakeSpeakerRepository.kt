package dev.jorgecastillo.compose.app.data

import dev.jorgecastillo.compose.app.models.Speaker

class FakeSpeakerRepository : SpeakerRepository {

    override fun getSpeakers(): List<Speaker> = listOf(
        Speaker("1", "John Doe", "Uber"),
        Speaker("2", "Sylvia Lotte", "Lyft"),
        Speaker("3", "Apis Anoubis", "Twitter"),
        Speaker("4", "Aeolus Phrixos", "Meta"),
        Speaker("5", "Oz David", "Apple"),
        Speaker("6", "Jagoda Viktorija", "Google"),
        Speaker("7", "Dympna Bride", "Snapchat"),
        Speaker("8", "Senan Donncha", "Instagram"),
        Speaker("9", "Dzidra Zoja", "Figma"),
        Speaker("10", "Magdalena Renata", "Zeplin"),
        Speaker("11", "Mladenka Doris", "Block"),
        Speaker("12", "Pooja Shanta", "Block"),
        Speaker("13", "Joana Martina", "Spotify"),
        Speaker("14", "Mumbi Aminatou", "Stripe"),
        Speaker("15", "Rustam Temir", "Shopify"),
        Speaker("16", "Akinyi Aaminata", "Microsoft"),
        Speaker("17", "Xenofon Kostakis", "IBM"),
        Speaker("18", "Margarida Xoana", "Cisco"),
        Speaker("19", "Giustina Samanta", "Datadog"),
        Speaker("20", "Julia Fernandez", "Zendesk"),
        Speaker("21", "Iida Kielo", "Helpscout"),
        Speaker("22", "Sofia Darja", "Citymapper"),
        Speaker("23", "Arild Aksel", "TravelPerk"),
        Speaker("24", "Tigran Areg", "Fiverr"),
        Speaker("25", "Hilmar Birgir", "Blinkist"),
        Speaker("26", "Teca Bea", "Babbel"),
        Speaker("27", "Lehua Malia", "Samsung"),
        Speaker("28", "Sajra Hatidža", "Foxconn"),
        Speaker("29", "Vardo Rusudan", "TikTok"),
        Speaker("30", "Zorka Snežana", "BeReal"),
        Speaker("31", "Ana Leocadia", "Rivian"),
        Speaker("32", "Celino Joaquín", "Tesla"),
        Speaker("33", "Adedayo Thabo", "Netflix"),
        Speaker("34", "Palesa Mojisola", "HBO"),
        Speaker("35", "Rehema Chisom", "Disney"),
        Speaker("36", "Lindiwe Nosipho", "Motorola"),
        Speaker("37", "Funmilayo Oluwaseun", "Slack"),
        Speaker("38", "Yejide Bose", "1Password"),
        Speaker("39", "Efua Ola", "GitHub"),
        Speaker("40", "Tiwonge Olusola", "Gradle"),
        Speaker("41", "Sílvia Roser", "Skyscanner"),
        Speaker("42", "Tadeu Josué", "Amazon"),
        Speaker("43", "Morteza Shahram", "LastPass"),
        Speaker("44", "Burhanuddin Javed", "Todoist"),
        Speaker("45", "Iniobong Chidi", "Duolingo"),
        Speaker("46", "Nanabah Kimimela", "Strava"),
        Speaker("47", "Walela Chidiebele", "Shazam")
    )

    override fun getSpeakerById(id: String): Speaker? =
        getSpeakers().find { it.id == id }
}