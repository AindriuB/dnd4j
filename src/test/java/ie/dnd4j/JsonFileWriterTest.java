package ie.dnd4j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonFileWriterTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonFileWriterTest.class);

    protected void writeOutput(Object object, String fileName) {
	ObjectMapper objectMapper = new ObjectMapper();
	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
	objectMapper.setSerializationInclusion(Include.NON_NULL);

	BufferedWriter writer;
	try {
	    writer = new BufferedWriter(new FileWriter(new File(fileName)));

	    objectMapper.writeValue(writer, object);
	} catch (IOException e) {
	    LOGGER.error("Error writing file {}", fileName, e);
	}
    }

}
