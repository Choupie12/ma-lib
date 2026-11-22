def call(Map config = [:]) {
    def nom = config.nom ?: 'monde'
    def langue = config.langue ?: 'fr'

    if (langue == 'en') {
        echo "Hello ${nom} from the Shared Library!"
    } else {
        echo "Bonjour ${nom} depuis la Shared Library !"
    }
}
