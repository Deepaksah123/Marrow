package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface getLessonActivityStatus extends FilterItemRecordCompanion {
    write IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, incrementTotalCount incrementtotalcount);

    write RemoteActionCompatParcelizer(isPaused ispaused, incrementTotalCount incrementtotalcount);

    public static abstract class write {
        private write() {
        }

        public final getMasterOrder AudioAttributesCompatParcelizer() {
            read readVar = this instanceof read ? (read) this : null;
            if (readVar != null) {
                return readVar.write();
            }
            return null;
        }

        public static final class read extends write {
            private final byte[] AudioAttributesCompatParcelizer;
            private final getMasterOrder IconCompatParcelizer;

            public /* synthetic */ read(getMasterOrder getmasterorder) {
                this(getmasterorder, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private read(getMasterOrder getmasterorder, byte[] bArr) {
                super((byte) 0);
                toMagicModuleMetaRepoModel.write(getmasterorder, "");
                this.IconCompatParcelizer = getmasterorder;
                this.AudioAttributesCompatParcelizer = null;
            }

            public final getMasterOrder write() {
                return this.IconCompatParcelizer;
            }
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static final class AudioAttributesCompatParcelizer extends write {
            private final byte[] write;

            public final byte[] IconCompatParcelizer() {
                return this.write;
            }
        }
    }
}
