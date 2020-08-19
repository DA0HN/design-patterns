package org.gabriel.solid.dependency_inversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class JSONFormatter implements Formatter {
    @Override public String format(Message message) throws FormatException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(message);
        }
        catch(JsonProcessingException e) {
            e.printStackTrace();
            throw new FormatException(e.getMessage());
        }
    }
}
