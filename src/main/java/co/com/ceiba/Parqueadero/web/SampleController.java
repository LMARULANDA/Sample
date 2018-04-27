package co.com.ceiba.Parqueadero.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import co.com.ceiba.Parqueadero.service.SampleService;

//@Controller: Con esta anotación Spring podrá detectar la clase SampleController cuando realice el escaneo de componentes
@Controller
public class SampleController {


    /*
    @Autowired:A través de esta anotación Spring será capaz de llevar a cabo la inyección de dependencias sobre el atributo marcado.
    En este caso, estamos inyectando la capa de servicio, y por eso no tenemos que instanciarla.
    */
    @Autowired
    private SampleService sampleService;

    public SampleController(SampleService sampleService){
        this.sampleService = sampleService;
    }
    /* @RequestMapping:Con esta anotación especificamos la ruta desde la que escuchará el servicio, y qué método le corresponde. */
    @RequestMapping(value= "/welcome/{userName}",method = RequestMethod.GET)
    /* @ResponseBody: Con ella definimos lo que será el cuerpo de la respuesta del servicio. */
    @ResponseBody

    /* @PathVariable: Sirve para indicar con qu&eacute; variable de la url se relaciona el parametro sobre el que se esta usando la anotacion. */
    public String welcome(@PathVariable("username") String userName){
        return sampleService.welcome(userName);
    }


}
