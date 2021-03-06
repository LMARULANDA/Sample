package co.com.ceiba.Parqueadero.web;

import org.junit.Before;
import org.junit.Test;
import co.com.ceiba.Parqueadero.service.SampleService;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;



public class SampleControllerTest {
    private SampleController sampleController;
    private SampleService sampleService;

    @Before
    public void init(){
        sampleService = mock(SampleService.class);
        sampleController = new SampleController(sampleService);
    }

    @Test
    public void sampleControllerShouldCallService(){
        String userName = "nroales";
        String expectedMessage = "message";
        when(sampleService.welcome(userName)).thenReturn(expectedMessage);

        String message = sampleController.welcome(userName);

        verify(sampleService).welcome(userName);
        assertTrue(message.equals(expectedMessage));
    }
}
