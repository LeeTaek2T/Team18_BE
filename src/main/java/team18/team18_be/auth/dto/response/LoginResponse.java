package team18.team18_be.auth.dto.response;

public record LoginResponse(
    String accessToken,
    String type
) {

}
