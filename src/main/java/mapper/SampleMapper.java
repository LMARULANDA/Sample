package mapper;


import org.springframework.data.repository.query.Param;


public interface SampleMapper {

    /*@Param para que (MyBatis)Hibernate identifique los campos a la hora de procesar las consultas.*/
    String getLanguageByUser(@Param("userName") String userName);
    String getMessageByLanguage(@Param("language") String language);

}
