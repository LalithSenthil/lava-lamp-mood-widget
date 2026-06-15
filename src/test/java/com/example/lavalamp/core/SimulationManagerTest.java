import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.lavalamp.core.SimulationManager;

class SimulationManagerTest {
    private SimulationManager simulationManager;

    @BeforeEach
    void setUp() {
        simulationManager = new SimulationManager();
    }

    @Test
    void testInitialization() {
        assertNotNull(simulationManager);
        assertEquals(0, simulationManager.getParticleCount());
    }

    @Test
    void testStartSimulation() {
        simulationManager.startSimulation();
        assertTrue(simulationManager.isRunning());
    }

    @Test
    void testStopSimulation() {
        simulationManager.startSimulation();
        simulationManager.stopSimulation();
        assertFalse(simulationManager.isRunning());
    }

    @Test
    void testParticleLifecycle() {
        simulationManager.startSimulation();
        simulationManager.addParticle();
        assertEquals(1, simulationManager.getParticleCount());
        simulationManager.updateSimulation();
        assertTrue(simulationManager.getParticles().get(0).isAlive());
    }

    @Test
    void testSimulationUpdate() {
        simulationManager.startSimulation();
        simulationManager.updateSimulation();
        // Add assertions to verify the state of particles after update
    }
}