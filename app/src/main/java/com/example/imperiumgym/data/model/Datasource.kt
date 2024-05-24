package com.example.imperiumgym.data.model

import com.example.imperiumgym.R
object Datasource {

    val data: List<Event> = listOf(
            Event("Meditation & moderner Buddhismus", "19:45 – 21:00", R.drawable.eventone,
                    listOf(Detail("Karlsruhe","Unser Programm \"Meditation " +
                            "und Moderner Buddhismus\" kombiniert traditionelle Weisheiten" +
                            " mit modernen Ansätzen, um dir praktische Werkzeuge zur " +
                            "Stressbewältigung, emotionalen Balance und geistigen Klarheit zu " +
                            "bieten. Es ist für Anfänger genauso geeignet wie für Fortgeschrittene, " +
                            "die ihre Praxis vertiefen möchten.", R.drawable.eventone)), false
            ),

            Event("Morning Flow", "21:00 – 22:00", R.drawable.eventtwo,
                    listOf(Detail("Ettlingen","Unser Programm \"Meditation" +
                            " und Moderner Buddhismus\" kombiniert traditionelle Weisheiten " +
                            "mit modernen Ansätzen, um dir praktische Werkzeuge zur " +
                            "Stressbewältigung, emotionalen Balance und geistigen Klarheit " +
                            "zu bieten. Es ist für Anfänger genauso geeignet wie für " +
                            "Fortgeschrittene, die ihre Praxis vertiefen möchten.", R.drawable.eventtwo)), false
            ),

            Event("Feel Good Yoga", "22:00 – 23:00", R.drawable.eventthree,
                    listOf(Detail("Südstadt","\"Feel Good Yoga\" ist ein " +
                            "umfassendes Yoga-Programm, das auf deine individuellen Bedürfnisse " +
                            "zugeschnitten ist. Mit sanften Yoga-Sequenzen, entspannenden " +
                            "Atemübungen und geführten Meditationen zielt dieses Programm darauf" +
                            " ab, dein Wohlbefinden zu steigern und dir zu helfen, dich " +
                            "in deinem Körper und Geist rundum wohlzufühlen.", R.drawable.eventthree)), false
            ),
            Event("Zumba", "06:45 – 08:00", R.drawable.eventfive,
                    listOf(Detail("Buxtehude","Zumba kombiniert " +
                            "lateinamerikanische und internationale Musik mit dynamischen und " +
                            "leicht zu erlernenden Tanzbewegungen, um ein effektives " +
                            "Ganzkörpertraining zu bieten. Dieses Programm ist so konzipiert, " +
                            "dass es alle Fitnesslevel anspricht und dabei gleichzeitig deinen " +
                            "Körper stärkt, dein Herz-Kreislauf-System verbessert und deine " +
                            "Stimmung hebt.", R.drawable.eventfive)), false
            ),

            Event("Vin & Yin", "08:45 – 10:00", R.drawable.eventfour,
                    listOf(Detail("Mannheim","\"Vin & Yin Yoga\" ist " +
                            "ein durchdachtes Yoga-Programm, das die Vorteile von Vinyasa" +
                            " und Yin Yoga miteinander verbindet. Während Vinyasa Yoga " +
                            "dich durch fließende Bewegungen und dynamische Sequenzen führt, " +
                            "fokussiert sich Yin Yoga auf tiefere Dehnungen und längeres Halten " +
                            "der Positionen, um Flexibilität und inneren Frieden zu fördern. " +
                            "Dieses Programm ist ideal für alle Fitness- und Erfahrungslevel, " +
                            "da es sowohl Kraft als auch Entspannung in einer harmonischen " +
                            "Einheit bietet.", R.drawable.eventfour)), false
            ),

            Event("Pump it up 45 min", "10:45 – 11:45", R.drawable.eventsix,
                    listOf(Detail("Knielingen","\"Pump It Up\" ist ein " +
                            "hochintensives Intervalltraining (HIIT), das Krafttraining, Cardio " +
                            "und funktionelle Bewegungen kombiniert, um ein umfassendes " +
                            "Ganzkörpertraining zu bieten. Innerhalb von nur 45 Minuten " +
                            "verbrennst du Kalorien, baust Muskeln auf und steigerst " +
                            "deine Fitness. Jede Session ist so konzipiert, dass sie sowohl " +
                            "für Anfänger als auch für Fortgeschrittene geeignet ist, indem " +
                            "sie verschiedene Intensitätsstufen und Modifikationen bietet.", R.drawable.eventsix)), false
            ),

            Event("Meditieren lernen", "12:00 – 13:00", R.drawable.eventseven,
                    listOf(Detail("Nordstadt","\"Meditieren lernen\" ist " +
                            "ein umfassendes Kursprogramm, das dir Schritt für Schritt beibringt, " +
                            "wie du effektiv meditierst. Egal, ob du ein absoluter Anfänger bist " +
                            "oder bereits erste Erfahrungen mit Meditation gemacht hast, " +
                            "dieses Programm bietet dir fundiertes Wissen und praktische Übungen, " +
                            "um deine Meditationspraxis zu vertiefen und zu verbessern.", R.drawable.eventseven)), false
            ),

            Event("Slow Vinyasa", "13:15 – 14:15", R.drawable.eventeight,
                    listOf(Detail("WestStadt","\"Slow Vinyasa Yoga\" ist " +
                            "ein sorgfältig gestaltetes Programm, das die " +
                            "dynamischen Elemente des Vinyasa Yoga mit der Ruhe " +
                            "und Achtsamkeit langsamer Bewegungen verbindet. Durch " +
                            "das bewusste, langsame Ausführen jeder Pose förderst du " +
                            "nicht nur deine körperliche Flexibilität und Stärke, " +
                            "sondern auch deine mentale Klarheit und innere Ruhe. Dieses " +
                            "Programm ist für Yogis aller Erfahrungsstufen geeignet und " +
                            "bietet eine Möglichkeit, tief in jede Bewegung und jeden Atemzug " +
                            "einzutauchen.", R.drawable.eventeight)), false
            ),

            Event("Wake up Yoga", "15:00 – 16:15", R.drawable.eventten,
                    listOf(Detail("Reutlingen","\"Wake Up Yoga\" ist ein " +
                            "anzheitliches Morgenprogramm, das darauf abzielt, " +
                            "Körper, Geist und Seele zu beleben und zu aktivieren. " +
                            "Mit einer Reihe von fließenden Bewegungen und Atemübungen " +
                            "weckt diese Praxis deine Energie, verbessert deine Flexibilität " +
                            "und fördert deine geistige Klarheit. Ob du dich gerade " +
                            "aus dem Bett rollst oder deine Morgenroutine ergänzen " +
                            "möchtest, \"Wake Up Yoga\" ist der perfekte Weg, um " +
                            "den Tag zu beginnen.", R.drawable.eventten)), false
            ),

            Event("Marathon", "17:00 – 18:00", R.drawable.eventnine,
                    listOf(Detail("Schwarzwald","Unser Marathon-Trainingsprogramm" +
                            " ist mehr als nur Laufen – es ist ein ganzheitlicher Ansatz," +
                            " der deine körperliche Fitness, mentale Ausdauer und Ernährung" +
                            " optimiert, um sicherzustellen, dass du bei deinem Marathonziel " +
                            "erfolgreich bist. Mit einem sorgfältig gestalteten Trainingsplan, " +
                            "Expertenberatung und einer unterstützenden Community an deiner " +
                            "Seite wirst du dich optimal auf das große Rennen vorbereiten " +
                            "können.", R.drawable.eventnine)), false
            ),

            Event("Halbmarathon", "19:45 – 21:00", R.drawable.eventeleven,
                    listOf(Detail("Würzburg","Unser Halbmarathon-Trainingsprogramm " +
                            "ist darauf ausgerichtet, Läufern aller " +
                            "Erfahrungsstufen die Werkzeuge und Unterstützung " +
                            "zu bieten, die sie benötigen, um erfolgreich einen " +
                            "Halbmarathon zu absolvieren. Mit einem ausgewogenen " +
                            "Mix aus Laufeinheiten, Krafttraining, Ernährungsberatung " +
                            "und mentalem Coaching wirst du optimal auf die Herausforderung" +
                            " vorbereitet sein. Unser Programm wird von erfahrenen " +
                            "Lauftrainern geleitet und bietet individuelle Anpassungen, " +
                            "um sicherzustellen, dass du deine Ziele erreichst.", R.drawable.eventeleven)), false
            ),

            Event("Triathlon", "21:15 – 22:10", R.drawable.eventtwelve,
                    listOf(Detail("Stuttgart","Unser Triathlon-Trainingsprogramm " +
                            "ist darauf ausgerichtet, Athleten aller Erfahrungsstufen" +
                            " die Werkzeuge und Unterstützung zu bieten, die sie benötigen, " +
                            "um erfolgreich einen Triathlon zu absolvieren. Mit einem ausgewogenen" +
                            " Mix aus Schwimm-, Rad- und Laufeinheiten, kombiniert mit " +
                            "Krafttraining, Ernährungsberatung und mentaler Vorbereitung, " +
                            "wirst du optimal auf die Herausforderung vorbereitet sein. " +
                            "Unser Programm wird von erfahrenen Triathlontrainern geleitet " +
                            "und bietet individuelle Anpassungen, um sicherzustellen, dass du" +
                            " deine Ziele erreichst.", R.drawable.eventtwelve)), false
            ),

            Event("Fitness-Challenge", "22:00 – 23:00", R.drawable.eventthirteen,
                    listOf(Detail("Mannheim","Die Spartan Fitness Challenge" +
                            " ist ein umfassendes Fitnessprogramm, das dich in 30 Tagen auf " +
                            "ein neues Fitnesslevel bringt. Entwickelt von den " +
                            "Experten hinter den weltweit bekannten Spartan Races, " +
                            "ist diese Challenge für jeden geeignet – vom Fitnessanfänger " +
                            "bis zum erfahrenen Athleten.", R.drawable.eventthirteen)), false
            ),

            Event("Spartan Race", "06:45 – 08:00", R.drawable.eventthourteen,
                    listOf(Detail("Wiesbaden","Spartan Race ist mehr " +
                            "als nur ein Lauf – es ist eine Bewegung, eine Gemeinschaft und ein " +
                            "Lebensstil. Mit verschiedenen Rennkategorien, die sich in Distanz " +
                            "und Schwierigkeitsgrad unterscheiden, gibt es für jeden eine passende Herausforderung:", R.drawable.eventthourteen)), false
            ),

            Event("CrossFit-Wettkampf", "08:45 – 10:00", R.drawable.eventfifteen,
                    listOf(Detail("Sachsen","Unser CrossFit-Wettkampf-Trainingsprogramm " +
                            "ist darauf ausgerichtet, Athleten aller Erfahrungsstufen " +
                            "die Werkzeuge und Unterstützung zu bieten, die sie benötigen, " +
                            "um erfolgreich an einem CrossFit-Wettkampf teilzunehmen." +
                            " Mit einem ausgewogenen Mix aus Krafttraining, Ausdauertraining," +
                            " Gymnastik und Technikübungen wirst du deine Fähigkeiten in " +
                            "allen Bereichen des CrossFit verbessern und dich auf die vielfältigen" +
                            " Herausforderungen des Wettkampfs vorbereiten. Unser Programm wird " +
                            "von erfahrenen CrossFit-Trainern geleitet und bietet individuelle " +
                            "Anpassungen, um sicherzustellen, dass du deine Ziele erreichst.",
                            R.drawable.eventfifteen)), false
            ),

            Event("Schwimmwettkampf", "10:10 – 11:00", R.drawable.eventsixteen,
                    listOf(Detail("Waldstadt","Unser Schwimmwettkampf-Trainingsprogramm " +
                            "richtet sich an Schwimmer aller Erfahrungsstufen und bietet " +
                            "individuelle Unterstützung und Anleitung, um deine Leistung im " +
                            "Wasser zu maximieren. Mit einem ausgewogenen Mix aus Techniktraining, " +
                            "Ausdauertraining und Wettkampfvorbereitung wirst du in der Lage sein, " +
                            "deine Schwimmfähigkeiten zu verbessern und selbstbewusst in den Wettkampf " +
                            "zu gehen. Unser Programm wird von erfahrenen Schwimmtrainern geleitet " +
                            "und bietet eine Vielzahl von Übungen und Workouts, um dich auf den " +
                            "Erfolg vorzubereiten.", R.drawable.eventsixteen)), false
            ),

            Event("Fahrradtour", "11:10 – 12:00", R.drawable.eventseventeen,
                    listOf(Detail("Würzburg","Unser Fahrradtour-Vorbereitungsprogramm " +
                            "richtet sich an Radfahrer aller Erfahrungsstufen, von Anfängern bis " +
                            "hin zu erfahrenen Tourenfahrern. Mit praktischen Tipps, Trainingsplänen" +
                            " und Ratschlägen für die Ausrüstung wirst du optimal auf deine" +
                            " Fahrradtour vorbereitet sein. Unser Programm bietet eine " +
                            "ausgewogene Mischung aus Fitnessvorbereitung, Routenplanung, " +
                            "Ausrüstungsberatung und Sicherheitstipps, damit du dich voll und " +
                            "ganz auf dein Abenteuer konzentrieren kannst.", R.drawable.eventseventeen)), false
            ),

            Event("Tennis-Turnier", "12:15 – 13:05", R.drawable.eventeightteen,
                    listOf(Detail("Niedersachsen","Unser Tennis " +
                            "Turnier-Vorbereitungsprogramm richtet sich an Spieler aller" +
                            " Erfahrungsstufen und bietet individuelle Unterstützung und " +
                            "Anleitung, um deine Fähigkeiten auf dem Court zu verbessern. " +
                            "Mit einem ausgewogenen Mix aus Techniktraining, Fitnessvorbereitung, " +
                            "Taktikübungen und mentaler Vorbereitung wirst du bereit sein, dein Bestes" +
                            " zu geben und dich in deinem nächsten Turnier zu behaupten. " +
                            "Unser Programm wird von erfahrenen Tennistrainern geleitet " +
                            "und bietet eine Vielzahl von Übungen und Workouts, um dich " +
                            "auf den Erfolg vorzubereiten.", R.drawable.eventeightteen)), false
            ),
        )
    }