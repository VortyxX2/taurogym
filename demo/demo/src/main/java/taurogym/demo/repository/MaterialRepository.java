package taurogym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taurogym.demo.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {}

