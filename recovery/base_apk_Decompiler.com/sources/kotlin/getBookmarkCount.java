package kotlin;

import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getBookmarkCount {
    private final getIntroDurationSeconds AudioAttributesCompatParcelizer;
    private final setRatingCount IconCompatParcelizer;
    private final setTagActive RemoteActionCompatParcelizer;

    public abstract getNotesCount RemoteActionCompatParcelizer();

    private getBookmarkCount(setRatingCount setratingcount, setTagActive settagactive, getIntroDurationSeconds getintrodurationseconds) {
        this.IconCompatParcelizer = setratingcount;
        this.RemoteActionCompatParcelizer = settagactive;
        this.AudioAttributesCompatParcelizer = getintrodurationseconds;
    }

    public final setRatingCount write() {
        return this.IconCompatParcelizer;
    }

    public final setTagActive AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getIntroDurationSeconds IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static final class write extends getBookmarkCount {
        private final RevisionSubjectStatusModel AudioAttributesCompatParcelizer;
        private final setActiveRecallQbankId.RemoteActionCompatParcelizer.write IconCompatParcelizer;
        private final write RemoteActionCompatParcelizer;
        private final setActiveRecallQbankId.RemoteActionCompatParcelizer read;
        private final boolean write;

        public final setActiveRecallQbankId.RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer() {
            return this.read;
        }

        public final write MediaBrowserCompatCustomActionResultReceiver() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setRatingCount setratingcount, setTagActive settagactive, getIntroDurationSeconds getintrodurationseconds, write writeVar) {
            super(setratingcount, settagactive, getintrodurationseconds, (byte) 0);
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(setratingcount, "");
            toMagicModuleMetaRepoModel.write(settagactive, "");
            this.read = remoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = writeVar;
            this.AudioAttributesCompatParcelizer = FilterItemRecordCreator.AudioAttributesCompatParcelizer(setratingcount, remoteActionCompatParcelizer.MediaMetadataCompat());
            setActiveRecallQbankId.RemoteActionCompatParcelizer.write writeVarIconCompatParcelizer = setPeopleSolved.AudioAttributesCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem());
            this.IconCompatParcelizer = writeVarIconCompatParcelizer == null ? setActiveRecallQbankId.RemoteActionCompatParcelizer.write.CLASS : writeVarIconCompatParcelizer;
            Boolean boolIconCompatParcelizer = setPeopleSolved.onPlayFromMediaId.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
            this.write = boolIconCompatParcelizer.booleanValue();
        }

        public final RevisionSubjectStatusModel read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final setActiveRecallQbankId.RemoteActionCompatParcelizer.write AudioAttributesImplApi26Parcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean MediaBrowserCompatItemReceiver() {
            return this.write;
        }

        @Override // kotlin.getBookmarkCount
        public final getNotesCount RemoteActionCompatParcelizer() {
            getNotesCount getnotescountAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer, "");
            return getnotescountAudioAttributesCompatParcelizer;
        }
    }

    public static final class IconCompatParcelizer extends getBookmarkCount {
        private final getNotesCount IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(getNotesCount getnotescount, setRatingCount setratingcount, setTagActive settagactive, getIntroDurationSeconds getintrodurationseconds) {
            super(setratingcount, settagactive, getintrodurationseconds, (byte) 0);
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            toMagicModuleMetaRepoModel.write(setratingcount, "");
            toMagicModuleMetaRepoModel.write(settagactive, "");
            this.IconCompatParcelizer = getnotescount;
        }

        @Override // kotlin.getBookmarkCount
        public final getNotesCount RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(RemoteActionCompatParcelizer());
        return sb.toString();
    }

    public /* synthetic */ getBookmarkCount(setRatingCount setratingcount, setTagActive settagactive, getIntroDurationSeconds getintrodurationseconds, byte b) {
        this(setratingcount, settagactive, getintrodurationseconds);
    }
}
