// Creditos: https://refactoring.guru/es/design-patterns/facade/java/example#example-0package facade;
package facade;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return (Codec) new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return (Codec) new OggCompressionCodec();
        }
    }
}
