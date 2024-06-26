package br.com.historico.historico.service;

import br.com.historico.historico.model.request.UserRequest;
import br.com.historico.historico.model.response.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    UserResponse create(UserRequest userRequest);

    Page<UserResponse> getAll(Pageable pageable);

    Optional<UserResponse> update(Long id, UserRequest userRequest);

    Optional<UserResponse> get(Long id);

    boolean delete(Long id);
}
