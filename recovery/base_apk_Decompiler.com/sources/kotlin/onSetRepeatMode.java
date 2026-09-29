package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class onSetRepeatMode {
    public static /* synthetic */ onRemoveQueueItemAt IconCompatParcelizer(onSetRating onsetrating, hasGetter hasgetter, boolean z, getAnswerMap getanswermap, int i) {
        if ((i & 1) != 0) {
            hasgetter = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return IconCompatParcelizer(onsetrating, hasgetter, z, getanswermap);
    }

    public static final class IconCompatParcelizer extends onRemoveQueueItemAt {
        final /* synthetic */ getAnswerMap<onRemoveQueueItemAt, getShowPopup> RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(boolean z, getAnswerMap<? super onRemoveQueueItemAt, getShowPopup> getanswermap) {
            super(z);
            this.RemoteActionCompatParcelizer = getanswermap;
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            this.RemoteActionCompatParcelizer.invoke(this);
        }
    }

    private static onRemoveQueueItemAt IconCompatParcelizer(onSetRating onsetrating, hasGetter hasgetter, boolean z, getAnswerMap<? super onRemoveQueueItemAt, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(onsetrating, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(z, getanswermap);
        if (hasgetter != null) {
            onsetrating.AudioAttributesCompatParcelizer(hasgetter, iconCompatParcelizer);
        } else {
            onsetrating.read(iconCompatParcelizer);
        }
        return iconCompatParcelizer;
    }
}
