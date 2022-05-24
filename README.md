# Android-ScoreTrack-App

RMA LV4, Android

Izraditi aplikaciju za praćenje rezultata košarkaške utakmice. Koristiti LiveData, ViewModel, ViewBinding i Koin za ubrizgavanje ovisnosti. Ekran Activitya na vrhu treba imati imati prikazan datum. Ispod toga treba biti podijeljen na dva dijela. S lijeve strane smjestiti naziv jedne ekipe, broj bodova, gumbe za dodavanje 3, 2 i 1 boda. Isto to ostvariti za drugu ekipu. Na dnu ekrana staviti gumb za reset. U ViewModel klasi treba instancirati 2 LiveData objekta koji predstavljaju rezultat i pretplatiti se na njihovu promjenu na UI-ju. Osim numeričkog prikaza, kada rezultat za pojedinu ekipu prijeđe 30, promijeniti boju odgovarajuće pozadine u boju po izboru. Korištenjem Koin biblioteke ubrizgati ovisnost o ViewModelu u Activity. Dodati gumb kojim se ovi podaci spremaju u dijeljene postavke i učitavaju prilikom kreiranja ViewModela (init blok). Ovisnost o dijeljenim postavkama ubrizgati u ViewModel korištenjem Koina (koristiti singleton).
