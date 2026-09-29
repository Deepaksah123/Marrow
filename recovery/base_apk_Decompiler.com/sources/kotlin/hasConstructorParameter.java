package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class hasConstructorParameter {

    interface IconCompatParcelizer {
        int IconCompatParcelizer();

        byte write(int i);
    }

    private static String AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        StringBuilder sb = new StringBuilder(iconCompatParcelizer.IconCompatParcelizer());
        for (int i = 0; i < iconCompatParcelizer.IconCompatParcelizer(); i++) {
            byte bWrite = iconCompatParcelizer.write(i);
            if (bWrite == 34) {
                sb.append("\\\"");
            } else if (bWrite == 39) {
                sb.append("\\'");
            } else if (bWrite != 92) {
                switch (bWrite) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bWrite >= 32 && bWrite <= 126) {
                            sb.append((char) bWrite);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bWrite >>> 6) & 3) + 48));
                            sb.append((char) (((bWrite >>> 3) & 7) + 48));
                            sb.append((char) ((bWrite & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String RemoteActionCompatParcelizer(final AnnotatedWithParams annotatedWithParams) {
        return AudioAttributesCompatParcelizer(new IconCompatParcelizer() { // from class: o.hasConstructorParameter.3
            @Override // o.hasConstructorParameter.IconCompatParcelizer
            public final int IconCompatParcelizer() {
                return annotatedWithParams.read();
            }

            @Override // o.hasConstructorParameter.IconCompatParcelizer
            public final byte write(int i) {
                return annotatedWithParams.IconCompatParcelizer(i);
            }
        });
    }

    static String IconCompatParcelizer(String str) {
        return RemoteActionCompatParcelizer(AnnotatedWithParams.AudioAttributesCompatParcelizer(str));
    }
}
