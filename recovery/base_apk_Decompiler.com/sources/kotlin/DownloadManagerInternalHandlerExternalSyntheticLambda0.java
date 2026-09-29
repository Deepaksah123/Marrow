package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class DownloadManagerInternalHandlerExternalSyntheticLambda0 {

    interface IconCompatParcelizer {
        byte read(int i);

        int write();
    }

    private static String read(IconCompatParcelizer iconCompatParcelizer) {
        StringBuilder sb = new StringBuilder(iconCompatParcelizer.write());
        for (int i = 0; i < iconCompatParcelizer.write(); i++) {
            byte b = iconCompatParcelizer.read(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                        if (b >= 32 && b <= 126) {
                            sb.append((char) b);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String IconCompatParcelizer(final DownloadIndex downloadIndex) {
        return read(new IconCompatParcelizer() { // from class: o.DownloadManagerInternalHandlerExternalSyntheticLambda0.2
            @Override // o.DownloadManagerInternalHandlerExternalSyntheticLambda0.IconCompatParcelizer
            public final int write() {
                return downloadIndex.write();
            }

            @Override // o.DownloadManagerInternalHandlerExternalSyntheticLambda0.IconCompatParcelizer
            public final byte read(int i) {
                return downloadIndex.AudioAttributesCompatParcelizer(i);
            }
        });
    }

    static String IconCompatParcelizer(String str) {
        return IconCompatParcelizer(DownloadIndex.AudioAttributesCompatParcelizer(str));
    }
}
