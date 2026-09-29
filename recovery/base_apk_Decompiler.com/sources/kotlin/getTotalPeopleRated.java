package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.getMasterOrder;
import kotlin.isActiveForNewTag;

/* JADX INFO: loaded from: classes4.dex */
public final class getTotalPeopleRated implements getMasterOrder.RemoteActionCompatParcelizer {
    private static final Map<RevisionSubjectStatusModel, isActiveForNewTag.IconCompatParcelizer> read;
    private static final boolean write = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    private int[] MediaBrowserCompatCustomActionResultReceiver = null;
    private String AudioAttributesCompatParcelizer = null;
    private int IconCompatParcelizer = 0;
    private String AudioAttributesImplBaseParcelizer = null;
    private String[] RemoteActionCompatParcelizer = null;
    private String[] MediaBrowserCompatMediaItem = null;
    private String[] AudioAttributesImplApi26Parcelizer = null;
    private isActiveForNewTag.IconCompatParcelizer MediaBrowserCompatItemReceiver = null;
    private String[] AudioAttributesImplApi21Parcelizer = null;

    @Override // o.getMasterOrder.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        HashMap map = new HashMap();
        read = map;
        map.put(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("kotlin.jvm.internal.KotlinClass")), isActiveForNewTag.IconCompatParcelizer.CLASS);
        map.put(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("kotlin.jvm.internal.KotlinFileFacade")), isActiveForNewTag.IconCompatParcelizer.FILE_FACADE);
        map.put(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("kotlin.jvm.internal.KotlinMultifileClass")), isActiveForNewTag.IconCompatParcelizer.MULTIFILE_CLASS);
        map.put(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("kotlin.jvm.internal.KotlinMultifileClassPart")), isActiveForNewTag.IconCompatParcelizer.MULTIFILE_CLASS_PART);
        map.put(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("kotlin.jvm.internal.KotlinSyntheticClass")), isActiveForNewTag.IconCompatParcelizer.SYNTHETIC_CLASS);
    }

    public final isActiveForNewTag read() {
        return IconCompatParcelizer(incrementTotalCount.AudioAttributesCompatParcelizer);
    }

    private isActiveForNewTag IconCompatParcelizer(incrementTotalCount incrementtotalcount) {
        int[] iArr;
        if (this.MediaBrowserCompatItemReceiver == null || (iArr = this.MediaBrowserCompatCustomActionResultReceiver) == null) {
            return null;
        }
        incrementTotalCount incrementtotalcount2 = new incrementTotalCount(iArr, (this.IconCompatParcelizer & 8) != 0);
        if (!incrementtotalcount2.IconCompatParcelizer(incrementtotalcount)) {
            this.AudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = null;
        } else if (IconCompatParcelizer() && this.RemoteActionCompatParcelizer == null) {
            return null;
        }
        String[] strArr = this.AudioAttributesImplApi21Parcelizer;
        return new isActiveForNewTag(this.MediaBrowserCompatItemReceiver, incrementtotalcount2, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatMediaItem, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, strArr != null ? getLastAttemptedTime.read(strArr) : null);
    }

    private boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver == isActiveForNewTag.IconCompatParcelizer.CLASS || this.MediaBrowserCompatItemReceiver == isActiveForNewTag.IconCompatParcelizer.FILE_FACADE || this.MediaBrowserCompatItemReceiver == isActiveForNewTag.IconCompatParcelizer.MULTIFILE_CLASS_PART;
    }

    @Override // o.getMasterOrder.RemoteActionCompatParcelizer
    public final getMasterOrder.AudioAttributesCompatParcelizer IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds) {
        isActiveForNewTag.IconCompatParcelizer iconCompatParcelizer;
        byte b = 0;
        if (revisionSubjectStatusModel == null) {
            IconCompatParcelizer(0);
        }
        getNotesCount getnotescountAudioAttributesCompatParcelizer = revisionSubjectStatusModel.AudioAttributesCompatParcelizer();
        if (getnotescountAudioAttributesCompatParcelizer.equals(getPsshData.AudioAttributesImplApi21Parcelizer)) {
            return new RemoteActionCompatParcelizer(this, b);
        }
        if (getnotescountAudioAttributesCompatParcelizer.equals(getPsshData.onCommand)) {
            return new AudioAttributesCompatParcelizer(this, b);
        }
        if (write || this.MediaBrowserCompatItemReceiver != null || (iconCompatParcelizer = read.get(revisionSubjectStatusModel)) == null) {
            return null;
        }
        this.MediaBrowserCompatItemReceiver = iconCompatParcelizer;
        return new read(this, b);
    }

    private static /* synthetic */ void IconCompatParcelizer(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "classId", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor", "visitAnnotation"));
    }

    class RemoteActionCompatParcelizer implements getMasterOrder.AudioAttributesCompatParcelizer {
        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(getTotalPeopleRated gettotalpeoplerated, byte b) {
            this();
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, Object obj) {
            if (getrelatedlessonid != null) {
                String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
                if ("k".equals(strAudioAttributesCompatParcelizer)) {
                    if (obj instanceof Integer) {
                        getTotalPeopleRated.this.MediaBrowserCompatItemReceiver = isActiveForNewTag.IconCompatParcelizer.read(((Integer) obj).intValue());
                        return;
                    }
                    return;
                }
                if ("mv".equals(strAudioAttributesCompatParcelizer)) {
                    if (obj instanceof int[]) {
                        getTotalPeopleRated.this.MediaBrowserCompatCustomActionResultReceiver = (int[]) obj;
                        return;
                    }
                    return;
                }
                if ("xs".equals(strAudioAttributesCompatParcelizer)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.isEmpty()) {
                            return;
                        }
                        getTotalPeopleRated.this.AudioAttributesCompatParcelizer = str;
                        return;
                    }
                    return;
                }
                if ("xi".equals(strAudioAttributesCompatParcelizer)) {
                    if (obj instanceof Integer) {
                        getTotalPeopleRated.this.IconCompatParcelizer = ((Integer) obj).intValue();
                        return;
                    }
                    return;
                }
                if ("pn".equals(strAudioAttributesCompatParcelizer) && (obj instanceof String)) {
                    String str2 = (String) obj;
                    if (str2.isEmpty()) {
                        return;
                    }
                    getTotalPeopleRated.this.AudioAttributesImplBaseParcelizer = str2;
                }
            }
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final getMasterOrder.read RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            String strAudioAttributesCompatParcelizer = getrelatedlessonid != null ? getrelatedlessonid.AudioAttributesCompatParcelizer() : null;
            if ("d1".equals(strAudioAttributesCompatParcelizer)) {
                return read();
            }
            if ("d2".equals(strAudioAttributesCompatParcelizer)) {
                return AudioAttributesCompatParcelizer();
            }
            return null;
        }

        private getMasterOrder.read read() {
            return new IconCompatParcelizer() { // from class: o.getTotalPeopleRated.RemoteActionCompatParcelizer.4
                @Override // o.getTotalPeopleRated.IconCompatParcelizer
                protected final void write(String[] strArr) {
                    if (strArr == null) {
                        AudioAttributesCompatParcelizer();
                    }
                    getTotalPeopleRated.this.RemoteActionCompatParcelizer = strArr;
                }

                private static /* synthetic */ void AudioAttributesCompatParcelizer() {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
                }
            };
        }

        private getMasterOrder.read AudioAttributesCompatParcelizer() {
            return new IconCompatParcelizer() { // from class: o.getTotalPeopleRated.RemoteActionCompatParcelizer.1
                @Override // o.getTotalPeopleRated.IconCompatParcelizer
                protected final void write(String[] strArr) {
                    if (strArr == null) {
                        IconCompatParcelizer();
                    }
                    getTotalPeopleRated.this.MediaBrowserCompatMediaItem = strArr;
                }

                private static /* synthetic */ void IconCompatParcelizer() {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
                }
            };
        }

        private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel) {
            if (revisionSubjectStatusModel != null) {
                return null;
            }
            RemoteActionCompatParcelizer(3);
            return null;
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getChildQuestions getchildquestions) {
            if (getchildquestions == null) {
                RemoteActionCompatParcelizer(0);
            }
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void write(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid2) {
            if (revisionSubjectStatusModel == null) {
                RemoteActionCompatParcelizer(1);
            }
            if (getrelatedlessonid2 == null) {
                RemoteActionCompatParcelizer(2);
            }
        }
    }

    class read implements getMasterOrder.AudioAttributesCompatParcelizer {
        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
        }

        private read() {
        }

        /* synthetic */ read(getTotalPeopleRated gettotalpeoplerated, byte b) {
            this();
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, Object obj) {
            if (getrelatedlessonid != null) {
                String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
                if ("version".equals(strAudioAttributesCompatParcelizer)) {
                    if (obj instanceof int[]) {
                        getTotalPeopleRated.this.MediaBrowserCompatCustomActionResultReceiver = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(strAudioAttributesCompatParcelizer)) {
                    getTotalPeopleRated.this.AudioAttributesCompatParcelizer = obj instanceof String ? (String) obj : null;
                }
            }
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final getMasterOrder.read RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            String strAudioAttributesCompatParcelizer = getrelatedlessonid != null ? getrelatedlessonid.AudioAttributesCompatParcelizer() : null;
            if ("data".equals(strAudioAttributesCompatParcelizer) || "filePartClassNames".equals(strAudioAttributesCompatParcelizer)) {
                return write();
            }
            if ("strings".equals(strAudioAttributesCompatParcelizer)) {
                return read();
            }
            return null;
        }

        private getMasterOrder.read write() {
            return new IconCompatParcelizer() { // from class: o.getTotalPeopleRated.read.1
                @Override // o.getTotalPeopleRated.IconCompatParcelizer
                protected final void write(String[] strArr) {
                    if (strArr == null) {
                        read();
                    }
                    getTotalPeopleRated.this.RemoteActionCompatParcelizer = strArr;
                }

                private static /* synthetic */ void read() {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
                }
            };
        }

        private getMasterOrder.read read() {
            return new IconCompatParcelizer() { // from class: o.getTotalPeopleRated.read.5
                @Override // o.getTotalPeopleRated.IconCompatParcelizer
                protected final void write(String[] strArr) {
                    if (strArr == null) {
                        AudioAttributesCompatParcelizer();
                    }
                    getTotalPeopleRated.this.MediaBrowserCompatMediaItem = strArr;
                }

                private static /* synthetic */ void AudioAttributesCompatParcelizer() {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
                }
            };
        }

        private static /* synthetic */ void write(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel) {
            if (revisionSubjectStatusModel != null) {
                return null;
            }
            write(3);
            return null;
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getChildQuestions getchildquestions) {
            if (getchildquestions == null) {
                write(0);
            }
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void write(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid2) {
            if (revisionSubjectStatusModel == null) {
                write(1);
            }
            if (getrelatedlessonid2 == null) {
                write(2);
            }
        }
    }

    class AudioAttributesCompatParcelizer implements getMasterOrder.AudioAttributesCompatParcelizer {
        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, Object obj) {
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
        }

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(getTotalPeopleRated gettotalpeoplerated, byte b) {
            this();
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final getMasterOrder.read RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            if ("b".equals(getrelatedlessonid != null ? getrelatedlessonid.AudioAttributesCompatParcelizer() : null)) {
                return read();
            }
            return null;
        }

        private getMasterOrder.read read() {
            return new IconCompatParcelizer() { // from class: o.getTotalPeopleRated.AudioAttributesCompatParcelizer.1
                @Override // o.getTotalPeopleRated.IconCompatParcelizer
                protected final void write(String[] strArr) {
                    if (strArr == null) {
                        write();
                    }
                    getTotalPeopleRated.this.AudioAttributesImplApi21Parcelizer = strArr;
                }

                private static /* synthetic */ void write() {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
                }
            };
        }

        private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel) {
            if (revisionSubjectStatusModel != null) {
                return null;
            }
            AudioAttributesCompatParcelizer(3);
            return null;
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getChildQuestions getchildquestions) {
            if (getchildquestions == null) {
                AudioAttributesCompatParcelizer(0);
            }
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void write(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid2) {
            if (revisionSubjectStatusModel == null) {
                AudioAttributesCompatParcelizer(1);
            }
            if (getrelatedlessonid2 == null) {
                AudioAttributesCompatParcelizer(2);
            }
        }
    }

    static abstract class IconCompatParcelizer implements getMasterOrder.read {
        private final List<String> RemoteActionCompatParcelizer = new ArrayList();

        protected abstract void write(String[] strArr);

        @Override // o.getMasterOrder.read
        public final void write(Object obj) {
            if (obj instanceof String) {
                this.RemoteActionCompatParcelizer.add((String) obj);
            }
        }

        @Override // o.getMasterOrder.read
        public final void RemoteActionCompatParcelizer() {
            write((String[]) this.RemoteActionCompatParcelizer.toArray(new String[0]));
        }

        private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // o.getMasterOrder.read
        public final getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
            if (revisionSubjectStatusModel != null) {
                return null;
            }
            RemoteActionCompatParcelizer(3);
            return null;
        }

        @Override // o.getMasterOrder.read
        public final void AudioAttributesCompatParcelizer(getChildQuestions getchildquestions) {
            if (getchildquestions == null) {
                RemoteActionCompatParcelizer(2);
            }
        }

        @Override // o.getMasterOrder.read
        public final void write(RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid) {
            if (revisionSubjectStatusModel == null) {
                RemoteActionCompatParcelizer(0);
            }
            if (getrelatedlessonid == null) {
                RemoteActionCompatParcelizer(1);
            }
        }
    }
}
