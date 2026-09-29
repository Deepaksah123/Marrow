package kotlin;

import android.R;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Tag;

/* JADX INFO: loaded from: classes4.dex */
public final class setOption1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> write(Collection<? extends H> collection, getAnswerMap<? super H, ? extends getVideoPageNotesTitle> getanswermap) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        Tag.write writeVar = Tag.RemoteActionCompatParcelizer;
        Tag tagAudioAttributesCompatParcelizer = Tag.write.AudioAttributesCompatParcelizer();
        while (true) {
            LinkedList linkedList2 = linkedList;
            if (!linkedList2.isEmpty()) {
                Object objRatingCompat = IntermediateLoginResponseBody.RatingCompat((List<? extends Object>) linkedList);
                Tag.write writeVar2 = Tag.RemoteActionCompatParcelizer;
                Tag tagAudioAttributesCompatParcelizer2 = Tag.write.AudioAttributesCompatParcelizer();
                Collection<R.bool> collectionAudioAttributesCompatParcelizer = getOptions.AudioAttributesCompatParcelizer(objRatingCompat, linkedList2, getanswermap, new AudioAttributesCompatParcelizer(tagAudioAttributesCompatParcelizer2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAudioAttributesCompatParcelizer, "");
                if (collectionAudioAttributesCompatParcelizer.size() == 1 && tagAudioAttributesCompatParcelizer2.isEmpty()) {
                    Object objMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = IntermediateLoginResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(collectionAudioAttributesCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
                    tagAudioAttributesCompatParcelizer.add(objMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                } else {
                    R.bool boolVar = (Object) getOptions.IconCompatParcelizer(collectionAudioAttributesCompatParcelizer, getanswermap);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolVar, "");
                    getVideoPageNotesTitle getvideopagenotestitleInvoke = getanswermap.invoke(boolVar);
                    for (R.bool boolVar2 : collectionAudioAttributesCompatParcelizer) {
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolVar2, "");
                        if (!getOptions.RemoteActionCompatParcelizer(getvideopagenotestitleInvoke, getanswermap.invoke(boolVar2))) {
                            tagAudioAttributesCompatParcelizer2.add(boolVar2);
                        }
                    }
                    Tag tag = tagAudioAttributesCompatParcelizer2;
                    if (!tag.isEmpty()) {
                        tagAudioAttributesCompatParcelizer.addAll(tag);
                    }
                    tagAudioAttributesCompatParcelizer.add(boolVar);
                }
            } else {
                return tagAudioAttributesCompatParcelizer;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [H] */
    static final class AudioAttributesCompatParcelizer<H> extends MagicModuleUseCase implements getAnswerMap<H, getShowPopup> {
        private /* synthetic */ Tag<H> AudioAttributesCompatParcelizer;

        private void AudioAttributesCompatParcelizer(H h) {
            Tag<H> tag = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(h, "");
            tag.add(h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Object obj) {
            AudioAttributesCompatParcelizer(obj);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(Tag<H> tag) {
            super(1);
            this.AudioAttributesCompatParcelizer = tag;
        }
    }
}
