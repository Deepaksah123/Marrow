package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setDrmSessionForClearTypes {
    public static final setDrmSessionForClearTypes read;
    public static final setDrmSessionForClearTypes IconCompatParcelizer = new setDrmSessionForClearTypes() { // from class: o.setDrmSessionForClearTypes.3
        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean AudioAttributesCompatParcelizer() {
            return true;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean read() {
            return true;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean AudioAttributesCompatParcelizer(onTracksChanged ontrackschanged) {
            return ontrackschanged == onTracksChanged.REMOTE;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean RemoteActionCompatParcelizer(boolean z, onTracksChanged ontrackschanged, onTimelineChanged ontimelinechanged) {
            return (ontrackschanged == onTracksChanged.RESOURCE_DISK_CACHE || ontrackschanged == onTracksChanged.MEMORY_CACHE) ? false : true;
        }
    };
    public static final setDrmSessionForClearTypes RemoteActionCompatParcelizer = new setDrmSessionForClearTypes() { // from class: o.setDrmSessionForClearTypes.4
        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean AudioAttributesCompatParcelizer(onTracksChanged ontrackschanged) {
            return false;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean RemoteActionCompatParcelizer(boolean z, onTracksChanged ontrackschanged, onTimelineChanged ontimelinechanged) {
            return false;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean read() {
            return false;
        }
    };
    public static final setDrmSessionForClearTypes write = new setDrmSessionForClearTypes() { // from class: o.setDrmSessionForClearTypes.1
        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean RemoteActionCompatParcelizer(boolean z, onTracksChanged ontrackschanged, onTimelineChanged ontimelinechanged) {
            return false;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean read() {
            return true;
        }

        @Override // kotlin.setDrmSessionForClearTypes
        public final boolean AudioAttributesCompatParcelizer(onTracksChanged ontrackschanged) {
            return (ontrackschanged == onTracksChanged.DATA_DISK_CACHE || ontrackschanged == onTracksChanged.MEMORY_CACHE) ? false : true;
        }
    };

    public abstract boolean AudioAttributesCompatParcelizer();

    public abstract boolean AudioAttributesCompatParcelizer(onTracksChanged ontrackschanged);

    public abstract boolean RemoteActionCompatParcelizer(boolean z, onTracksChanged ontrackschanged, onTimelineChanged ontimelinechanged);

    public abstract boolean read();

    static {
        new setDrmSessionForClearTypes() { // from class: o.setDrmSessionForClearTypes.5
            @Override // kotlin.setDrmSessionForClearTypes
            public final boolean AudioAttributesCompatParcelizer() {
                return true;
            }

            @Override // kotlin.setDrmSessionForClearTypes
            public final boolean AudioAttributesCompatParcelizer(onTracksChanged ontrackschanged) {
                return false;
            }

            @Override // kotlin.setDrmSessionForClearTypes
            public final boolean read() {
                return false;
            }

            @Override // kotlin.setDrmSessionForClearTypes
            public final boolean RemoteActionCompatParcelizer(boolean z, onTracksChanged ontrackschanged, onTimelineChanged ontimelinechanged) {
                return (ontrackschanged == onTracksChanged.RESOURCE_DISK_CACHE || ontrackschanged == onTracksChanged.MEMORY_CACHE) ? false : true;
            }
        };
        read = new setDrmSessionForClearTypes() { // from class: o.setDrmSessionForClearTypes.2
            @Override // kotlin.setDrmSessionForClearTypes
            public final boolean AudioAttributesCompatParcelizer() {
                return true;
            }

            @Override // kotlin.setDrmSessionForClearTypes
            public final boolean read() {
                return true;
            }

            @Override // kotlin.setDrmSessionForClearTypes
            public final boolean AudioAttributesCompatParcelizer(onTracksChanged ontrackschanged) {
                return ontrackschanged == onTracksChanged.REMOTE;
            }

            @Override // kotlin.setDrmSessionForClearTypes
            public final boolean RemoteActionCompatParcelizer(boolean z, onTracksChanged ontrackschanged, onTimelineChanged ontimelinechanged) {
                return ((z && ontrackschanged == onTracksChanged.DATA_DISK_CACHE) || ontrackschanged == onTracksChanged.LOCAL) && ontimelinechanged == onTimelineChanged.TRANSFORMED;
            }
        };
    }
}
