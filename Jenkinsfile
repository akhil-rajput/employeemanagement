node{  
  stage('SCM checkout'){
    
   git'https://github.com/akhil-rajput/employeemanagement/' 
   
  }
  stage('test stage'){
bat'mvn test'
}
  
  
stage ('Install Stage') {
bat'mvn clean install'
}


}
