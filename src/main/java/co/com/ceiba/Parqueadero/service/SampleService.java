package co.com.ceiba.Parqueadero.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.ceiba.Parqueadero.repository.SampleRepository;

/*@Service:permite que Spring reconozca a SampleService como servicio al escanear los componentes de la aplicación*/

@Service
/*capa de servicio:un metodo de servicio definira una operacion a nivel de negocio*/
public class SampleService {

    /*
    @Autowired:A través de esta anotación Spring será capaz de llevar a cabo la inyección de dependencias sobre el atributo marcado.
    En este caso, estamos inyectando la capa de servicio, y por eso no tenemos que instanciarla.
    */
    @Autowired
    private SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }
    public String welcome(String userName){
        return sampleRepository.getMessageByUser(userName);
    }

}
