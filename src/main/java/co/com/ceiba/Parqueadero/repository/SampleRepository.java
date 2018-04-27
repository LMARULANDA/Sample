package co.com.ceiba.Parqueadero.repository;

import mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*desarrollar el repositorio al que ha invocado el servidor*/
@Repository
public class SampleRepository {

    @Autowired
    private SampleMapper sampleMapper;

    public SampleRepository(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    public String getMessageByUser(String userName){
        String language = sampleMapper.getLanguageByUser(userName);
        return sampleMapper.getMessageByLanguage(language);
    }




}
