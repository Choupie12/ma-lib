def call(String statut) {
    echo "[${env.JOB_NAME} #${env.BUILD_NUMBER}] Résultat : ${statut}"
}
