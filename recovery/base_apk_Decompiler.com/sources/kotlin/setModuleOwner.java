package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface setModuleOwner {
    public static final setModuleOwner read = new setModuleOwner() { // from class: o.setModuleOwner.4
        @Override // kotlin.setModuleOwner
        public final read write(extract extractVar, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getLink getlink, List<getMeta> list, List<getBadgeText> list2) {
            if (extractVar == null) {
                write(0);
            }
            if (courseConfigV2CustomModuleQuestionSource == null) {
                write(1);
            }
            if (getlink == null) {
                write(2);
            }
            if (list == null) {
                write(3);
            }
            if (list2 == null) {
                write(4);
            }
            return new read(getlink, null, list, list2, Collections.emptyList());
        }

        @Override // kotlin.setModuleOwner
        public final void AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle, List<String> list) {
            if (gettestheadertitle == null) {
                write(5);
            }
            if (list == null) {
                write(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        private static /* synthetic */ void write(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    };

    void AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle, List<String> list);

    read write(extract extractVar, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getLink getlink, List<getMeta> list, List<getBadgeText> list2);

    public static class read {
        private final boolean AudioAttributesCompatParcelizer;
        private final List<getMeta> AudioAttributesImplApi26Parcelizer;
        private final getLink IconCompatParcelizer;
        private final List<getBadgeText> RemoteActionCompatParcelizer;
        private final getLink read;
        private final List<String> write;

        public read(getLink getlink, getLink getlink2, List<getMeta> list, List<getBadgeText> list2, List<String> list3) {
            if (getlink == null) {
                write(0);
            }
            if (list == null) {
                write(1);
            }
            if (list2 == null) {
                write(2);
            }
            if (list3 == null) {
                write(3);
            }
            this.read = getlink;
            this.IconCompatParcelizer = null;
            this.AudioAttributesImplApi26Parcelizer = list;
            this.RemoteActionCompatParcelizer = list2;
            this.write = list3;
            this.AudioAttributesCompatParcelizer = false;
        }

        public final getLink RemoteActionCompatParcelizer() {
            getLink getlink = this.read;
            if (getlink == null) {
                write(4);
            }
            return getlink;
        }

        public final getLink IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final List<getMeta> write() {
            List<getMeta> list = this.AudioAttributesImplApi26Parcelizer;
            if (list == null) {
                write(5);
            }
            return list;
        }

        public final List<getBadgeText> read() {
            List<getBadgeText> list = this.RemoteActionCompatParcelizer;
            if (list == null) {
                write(6);
            }
            return list;
        }

        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final List<String> AudioAttributesCompatParcelizer() {
            List<String> list = this.write;
            if (list == null) {
                write(7);
            }
            return list;
        }

        private static /* synthetic */ void write(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }
    }
}
