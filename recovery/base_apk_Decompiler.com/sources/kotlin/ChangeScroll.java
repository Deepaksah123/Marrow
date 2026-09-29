package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\b\u001a\u00020\u0004*\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00040\u00012\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0004\u0012\u00020\u00040\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/Module;", "Lkotlin/Function1;", "Lo/getPosition;", "", "", "p0", "Lo/getAdapterPosition;", "p1", "read", "(Lo/Module;Lo/getAnswerMap;Lo/getAnswerMap;)V", "Lo/isAttachedToTransitionOverlay;", "RemoteActionCompatParcelizer", "(Lo/Module;)Lo/isAttachedToTransitionOverlay;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChangeScroll {
    private static final void read(Module module, final getAnswerMap<? super getAnswerMap<? super getPosition, Boolean>, getShowPopup> getanswermap, final getAnswerMap<? super getAnswerMap<? super getAdapterPosition, getShowPopup>, getShowPopup> getanswermap2) {
        PropertyName.write(module, ThreadChecker.INSTANCE, new getAnswerMap() { // from class: o.ChangeTransform
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ChangeScroll.AudioAttributesCompatParcelizer(getanswermap2, getanswermap, (createForPropertyOverride) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(getAnswerMap getanswermap, getAnswerMap getanswermap2, createForPropertyOverride createforpropertyoverride) {
        if (createforpropertyoverride instanceof InstrumentationActivityInvokerEmptyActivity1) {
            getanswermap.invoke(((InstrumentationActivityInvokerEmptyActivity1) createforpropertyoverride).read());
            return true;
        }
        if (!(createforpropertyoverride instanceof Checks)) {
            throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
        }
        getanswermap2.invoke(((Checks) createforpropertyoverride).write());
        return true;
    }

    public static final isAttachedToTransitionOverlay RemoteActionCompatParcelizer(Module module) {
        final getAdapterPosition getadapterposition = new getAdapterPosition();
        read(module, new read(getadapterposition), new getAnswerMap() { // from class: o.Explode
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ChangeScroll.IconCompatParcelizer(getadapterposition, (getAnswerMap) obj);
            }
        });
        return getadapterposition.RemoteActionCompatParcelizer();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<getAnswerMap<? super getPosition, ? extends Boolean>, getShowPopup> {
        public final void IconCompatParcelizer(getAnswerMap<? super getPosition, Boolean> getanswermap) {
            ((getAdapterPosition) this.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer(getanswermap);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getAnswerMap<? super getPosition, ? extends Boolean> getanswermap) {
            IconCompatParcelizer(getanswermap);
            return getShowPopup.INSTANCE;
        }

        read(Object obj) {
            super(1, obj, getAdapterPosition.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getAdapterPosition getadapterposition, getAnswerMap getanswermap) {
        getanswermap.invoke(getadapterposition);
        return getShowPopup.INSTANCE;
    }
}
