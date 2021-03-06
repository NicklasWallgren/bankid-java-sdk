package dev.nicklasw.bankid.client.response;

import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.nicklasw.bankid.client.model.ErrorCode;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor(force = true)
@EqualsAndHashCode(callSuper = false)
public class Response {
    @JsonProperty("errorCode")
    protected ErrorCode errorCode;
    @JsonProperty("details")
    protected String details;

    public boolean hasErrorCode() {
        return errorCode != null;
    }

    public Optional<ErrorCode> optionalErrorCode() {
        return Optional.ofNullable(errorCode);
    }

    public Optional<String> optionalDetails() {
        return Optional.ofNullable(details);
    }

}
