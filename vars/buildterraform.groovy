def call(){
    stage('Terraform Build') {
        echo "Building the infra with terraform"
        sh '''
                terraform version
                terraform init
                terraform fmt
                terraform validate
                terraform plan 
                terraform apply --auto-approve
                '''
    }
}
