package kotlin;

import kotlin.CurrentQuery;
import o.CurrentQuery.write;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PlaybackSettingsCompanion<B extends CurrentQuery.write, E extends B> implements CurrentQuery.IconCompatParcelizer<E> {
    private final getAnswerMap<CurrentQuery.write, E> IconCompatParcelizer;
    private final CurrentQuery.IconCompatParcelizer<?> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.CurrentQuery$IconCompatParcelizer<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o.getAnswerMap<? super o.CurrentQuery$write, ? extends E extends B>, o.getAnswerMap<o.CurrentQuery$write, E extends B>] */
    public PlaybackSettingsCompanion(CurrentQuery.IconCompatParcelizer<B> iconCompatParcelizer, getAnswerMap<? super CurrentQuery.write, ? extends E> getanswermap) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.IconCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer instanceof PlaybackSettingsCompanion ? (CurrentQuery.IconCompatParcelizer<B>) ((PlaybackSettingsCompanion) iconCompatParcelizer).RemoteActionCompatParcelizer : iconCompatParcelizer;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lo/CurrentQuery$write;)TE; */
    public final CurrentQuery.write RemoteActionCompatParcelizer(CurrentQuery.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        return (CurrentQuery.write) this.IconCompatParcelizer.invoke(writeVar);
    }

    public final boolean write(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        return iconCompatParcelizer == this || this.RemoteActionCompatParcelizer == iconCompatParcelizer;
    }
}
