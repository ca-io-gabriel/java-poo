```mermaid
classDiagram
direction BT
    class iPhone {
    }

    class TelephoneDevice {
	    call(int number)
	    answerCall()
	    startVoicemail()
    }

    class InternetBrowser {
	    showPage()
	    addTab()
	    updatePage()
    }

    class MusicPlayer {
	    playMusic()
	    pauseMusic()
	    selectMusic(String music)
    }

	<<Class>> iPhone
	<<Interface>> TelephoneDevice
	<<Interface>> InternetBrowser
	<<Interface>> MusicPlayer

    iPhone <|-- MusicPlayer
    iPhone <|-- TelephoneDevice
    iPhone <|-- InternetBrowser
```