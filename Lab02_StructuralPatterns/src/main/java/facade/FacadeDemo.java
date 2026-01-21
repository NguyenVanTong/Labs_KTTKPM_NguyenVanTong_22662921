package facade;

/**
 * Complex Subsystems
 */
class CPU {
    public void freeze() {
        System.out.println("CPU: Freezing processor");
    }
    
    public void jump(long position) {
        System.out.println("CPU: Jumping to position " + position);
    }
    
    public void execute() {
        System.out.println("CPU: Executing instructions");
    }
}

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory: Loading data at position " + position);
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive: Reading " + size + " bytes from sector " + lba);
        return new byte[size];
    }
}

class GraphicsCard {
    public void initialize() {
        System.out.println("GraphicsCard: Initializing graphics");
    }
    
    public void renderScreen() {
        System.out.println("GraphicsCard: Rendering screen");
    }
}

class SoundCard {
    public void initialize() {
        System.out.println("SoundCard: Initializing audio");
    }
    
    public void playStartupSound() {
        System.out.println("SoundCard: Playing startup sound");
    }
}

/**
 * Facade - Cung cấp interface đơn giản
 */
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private GraphicsCard graphics;
    private SoundCard sound;
    
    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
        this.graphics = new GraphicsCard();
        this.sound = new SoundCard();
    }
    
    public void start() {
        System.out.println("\n>>> Starting Computer...\n");
        
        // Simplified interface - hides complex startup sequence
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        graphics.initialize();
        sound.initialize();
        cpu.execute();
        graphics.renderScreen();
        sound.playStartupSound();
        
        System.out.println("\n>>> Computer started successfully!\n");
    }
    
    public void shutdown() {
        System.out.println("\n>>> Shutting down Computer...\n");
        
        System.out.println("SoundCard: Playing shutdown sound");
        System.out.println("GraphicsCard: Turning off display");
        System.out.println("Memory: Clearing memory");
        System.out.println("CPU: Stopping processor");
        
        System.out.println("\n>>> Computer shut down successfully!\n");
    }
    
    public void restart() {
        System.out.println("\n>>> Restarting Computer...\n");
        shutdown();
        start();
    }
}

/**
 * Demo class
 */
public class FacadeDemo {
    public static void main(String[] args) {
        System.out.println("=== FACADE PATTERN DEMO ===");
        
        // Client chỉ cần tương tác với Facade
        // Không cần biết chi tiết bên trong
        ComputerFacade computer = new ComputerFacade();
        
        // Start computer - simple interface hides complex process
        computer.start();
        
        System.out.println("... User working on computer ...\n");
        
        // Restart computer
        computer.restart();
        
        System.out.println("... More work ...\n");
        
        // Shutdown computer
        computer.shutdown();
        
        System.out.println("=== Facade Pattern Benefits ===");
        System.out.println("1. Đơn giản hóa interface phức tạp");
        System.out.println("2. Client không cần biết chi tiết implementation");
        System.out.println("3. Giảm coupling giữa client và subsystems");
        System.out.println("4. Dễ sử dụng và dễ bảo trì");
        System.out.println("5. Một điểm truy cập duy nhất cho nhiều subsystems");
    }
}
