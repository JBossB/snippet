
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.FileOutputStream;
import java.io.IOException;
/***
* 
* @author 
* Clase Funcionando en modo manual (main[])
* 
*/
public class RestTemplateCurlExample {

    public static void main(String[] args) throws IOException {
        String url = "http://localhost:2737/translateDoc?langpair=spa|ast";
        String filePath = "/opt/kaz.odt";
        String outputFilePath = "/opt/ast.odt";

        RestTemplate restTemplate = new RestTemplate();

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file", new FileSystemResource(filePath));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

        ResponseEntity<byte[]> response = restTemplate.postForEntity(url, requestEntity, byte[].class);
        if (response.getStatusCode().is2xxSuccessful()) {
            byte[] result = response.getBody();
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            fos.write(result);
            fos.close();
            System.out.println("Archivo creado");
        } else {
            System.out.println("Ocurrió un error al crear el archivo. Código de respuesta: " + response.getStatusCode());
        }
    }
}