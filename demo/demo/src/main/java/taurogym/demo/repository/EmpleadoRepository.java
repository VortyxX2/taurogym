package taurogym.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import taurogym.demo.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
