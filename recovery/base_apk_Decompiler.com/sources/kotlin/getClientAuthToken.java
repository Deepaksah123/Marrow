package kotlin;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.getIds;

/* JADX INFO: loaded from: classes5.dex */
public final class getClientAuthToken extends LessonIndexResponseBody<Long> {
    private long AudioAttributesCompatParcelizer;
    private getIds IconCompatParcelizer;
    private TimeUnit read;
    private long write;

    public getClientAuthToken(long j, long j2, TimeUnit timeUnit, getIds getids) {
        this.AudioAttributesCompatParcelizer = j;
        this.write = j2;
        this.read = timeUnit;
        this.IconCompatParcelizer = getids;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super Long> getupdates) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(getupdates);
        getupdates.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        getIds getids = this.IconCompatParcelizer;
        if (getids instanceof setCouponCode) {
            getIds.IconCompatParcelizer IconCompatParcelizer2 = getids.IconCompatParcelizer();
            iconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer2);
            IconCompatParcelizer2.read(iconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, this.read);
            return;
        }
        iconCompatParcelizer.IconCompatParcelizer(getids.write(iconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, this.read));
    }

    static final class IconCompatParcelizer extends AtomicReference<MarkIncompleteResponseBody> implements MarkIncompleteResponseBody, Runnable {
        private getUpdates<? super Long> read;
        private long write;

        IconCompatParcelizer(getUpdates<? super Long> getupdates) {
            this.read = getupdates;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return get() == getSubjectId.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != getSubjectId.DISPOSED) {
                getUpdates<? super Long> getupdates = this.read;
                long j = this.write;
                this.write = 1 + j;
                getupdates.read(Long.valueOf(j));
            }
        }

        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody);
        }
    }
}
