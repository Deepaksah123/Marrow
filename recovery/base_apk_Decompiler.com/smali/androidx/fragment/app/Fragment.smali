###### Class androidx.fragment.app.Fragment (androidx.fragment.app.Fragment)
.class public Landroidx/fragment/app/Fragment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Lo/TypeResolutionContext;
.implements Lo/anyExplicitsWithoutIgnoral;
.implements Lo/PieChart;
.implements Lo/r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/Fragment$write;,
        Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;,
        Landroidx/fragment/app/Fragment$IconCompatParcelizer;,
        Landroidx/fragment/app/Fragment$SavedState;
    }
.end annotation


# static fields
.field static final ACTIVITY_CREATED:I = 0x4

.field static final ATTACHED:I = 0x0

.field static final AWAITING_ENTER_EFFECTS:I = 0x6

.field static final AWAITING_EXIT_EFFECTS:I = 0x3

.field static final CREATED:I = 0x1

.field static final INITIALIZING:I = -0x1

.field static final RESUMED:I = 0x7

.field static final STARTED:I = 0x5

.field static final USE_DEFAULT_TRANSITION:Ljava/lang/Object;

.field static final VIEW_CREATED:I = 0x2


# instance fields
.field public mAdded:Z

.field public mAnimationInfo:Landroidx/fragment/app/Fragment$write;

.field public mArguments:Landroid/os/Bundle;

.field public mBackStackNesting:I

.field public mBeingSaved:Z

.field private mCalled:Z

.field public mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

.field public mContainer:Landroid/view/ViewGroup;

.field public mContainerId:I

.field private mContentLayoutId:I

.field public mDefaultFactory:Lo/VisibilityChecker$RemoteActionCompatParcelizer;

.field public mDeferStart:Z

.field mDetached:Z

.field public mFragmentId:I

.field public mFragmentManager:Landroidx/fragment/app/FragmentManager;

.field public mFromLayout:Z

.field mHasMenu:Z

.field public mHidden:Z

.field public mHiddenChanged:Z

.field public mHost:Lo/pessimisticallyValidateBounds;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/pessimisticallyValidateBounds<",
            "*>;"
        }
    .end annotation
.end field

.field public mInDynamicContainer:Z

.field public mInLayout:Z

.field public mIsCreated:Z

.field private mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

.field mLayoutInflater:Landroid/view/LayoutInflater;

.field public mLifecycleRegistry:Lo/getSetterUnchecked;

.field public mMaxState:Lo/anyIgnorals$write;

.field mMenuVisible:Z

.field private final mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final mOnPreAttachedListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment$IconCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field public mParentFragment:Landroidx/fragment/app/Fragment;

.field public mPerformedCreateView:Z

.field mPostponedDurationRunnable:Ljava/lang/Runnable;

.field mPostponedHandler:Landroid/os/Handler;

.field public mPreviousWho:Ljava/lang/String;

.field public mRemoving:Z

.field public mRestored:Z

.field public mRetainInstance:Z

.field public mRetainInstanceChangedWhileDetached:Z

.field public mSavedFragmentState:Landroid/os/Bundle;

.field private final mSavedStateAttachListener:Landroidx/fragment/app/Fragment$IconCompatParcelizer;

.field public mSavedStateRegistryController:Lo/setRenderer;

.field public mSavedUserVisibleHint:Ljava/lang/Boolean;

.field public mSavedViewRegistryState:Landroid/os/Bundle;

.field public mSavedViewState:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field public mState:I

.field public mTag:Ljava/lang/String;

.field public mTarget:Landroidx/fragment/app/Fragment;

.field public mTargetRequestCode:I

.field public mTargetWho:Ljava/lang/String;

.field public mTransitioning:Z

.field public mUserVisibleHint:Z

.field public mView:Landroid/view/View;

.field public mViewLifecycleOwner:Lo/_renameWithWrappers;

.field public mViewLifecycleOwnerLiveData:Lo/POJOPropertyBuilder2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/POJOPropertyBuilder2<",
            "Lo/hasGetter;",
            ">;"
        }
    .end annotation
.end field

.field public mWho:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 129
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 597
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 141
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    .line 153
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    const/4 v0, 0x0

    .line 162
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    .line 168
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    .line 210
    new-instance v0, Lo/_checkRenameByField;

    invoke-direct {v0}, Lo/_checkRenameByField;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    const/4 v0, 0x1

    .line 247
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    .line 263
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    .line 275
    new-instance v0, Landroidx/fragment/app/Fragment$4;

    invoke-direct {v0, p0}, Landroidx/fragment/app/Fragment$4;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    .line 301
    sget-object v0, Lo/anyIgnorals$write;->write:Lo/anyIgnorals$write;

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mMaxState:Lo/anyIgnorals$write;

    .line 308
    new-instance v0, Lo/POJOPropertyBuilder2;

    invoke-direct {v0}, Lo/POJOPropertyBuilder2;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwnerLiveData:Lo/POJOPropertyBuilder2;

    .line 317
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 319
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    .line 325
    new-instance v0, Landroidx/fragment/app/Fragment$5;

    invoke-direct {v0, p0}, Landroidx/fragment/app/Fragment$5;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedStateAttachListener:Landroidx/fragment/app/Fragment$IconCompatParcelizer;

    .line 598
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->initLifecycle()V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    .line 624
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 625
    iput p1, p0, Landroidx/fragment/app/Fragment;->mContentLayoutId:I

    return-void
.end method

.method private ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;
    .registers 2

    .line 3408
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez v0, :cond_b

    .line 3409
    new-instance v0, Landroidx/fragment/app/Fragment$write;

    invoke-direct {v0}, Landroidx/fragment/app/Fragment$write;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    .line 3411
    :cond_b
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    return-object p0
.end method

.method private getMinimumMaxLifecycleState()I
    .registers 3

    .line 440
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mMaxState:Lo/anyIgnorals$write;

    sget-object v1, Lo/anyIgnorals$write;->IconCompatParcelizer:Lo/anyIgnorals$write;

    if-eq v0, v1, :cond_1c

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mParentFragment:Landroidx/fragment/app/Fragment;

    if-nez v0, :cond_b

    goto :goto_1c

    .line 443
    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mMaxState:Lo/anyIgnorals$write;

    invoke-virtual {v0}, Lo/anyIgnorals$write;->ordinal()I

    move-result v0

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mParentFragment:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->getMinimumMaxLifecycleState()I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0

    .line 441
    :cond_1c
    :goto_1c
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mMaxState:Lo/anyIgnorals$write;

    invoke-virtual {p0}, Lo/anyIgnorals$write;->ordinal()I

    move-result p0

    return p0
.end method

.method private getTargetFragment(Z)Landroidx/fragment/app/Fragment;
    .registers 2

    if-eqz p1, :cond_5

    .line 928
    invoke-static {p0}, Lo/getJsonValueAccessor;->IconCompatParcelizer(Landroidx/fragment/app/Fragment;)V

    .line 931
    :cond_5
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mTarget:Landroidx/fragment/app/Fragment;

    if-eqz p1, :cond_a

    return-object p1

    .line 935
    :cond_a
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz p1, :cond_17

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    if-eqz p0, :cond_17

    .line 937
    invoke-virtual {p1, p0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0

    :cond_17
    const/4 p0, 0x0

    return-object p0
.end method

.method private initLifecycle()V
    .registers 3

    .line 629
    new-instance v0, Lo/getSetterUnchecked;

    invoke-direct {v0, p0}, Lo/getSetterUnchecked;-><init>(Lo/hasGetter;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    .line 630
    invoke-static {p0}, Lo/setRenderer;->AudioAttributesCompatParcelizer(Lo/PieChart;)Lo/setRenderer;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedStateRegistryController:Lo/setRenderer;

    const/4 v0, 0x0

    .line 633
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mDefaultFactory:Lo/VisibilityChecker$RemoteActionCompatParcelizer;

    .line 634
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mSavedStateAttachListener:Landroidx/fragment/app/Fragment$IconCompatParcelizer;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    .line 635
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedStateAttachListener:Landroidx/fragment/app/Fragment$IconCompatParcelizer;

    invoke-direct {p0, v0}, Landroidx/fragment/app/Fragment;->registerOnPreAttachListener(Landroidx/fragment/app/Fragment$IconCompatParcelizer;)V

    :cond_1f
    return-void
.end method

.method public static instantiate(Landroid/content/Context;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 649
    invoke-static {p0, p1, v0}, Landroidx/fragment/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method public static instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;
    .registers 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 676
    const-string v0, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v1, "Unable to instantiate fragment "

    :try_start_4
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    .line 675
    invoke-static {p0, p1}, Lo/NopAnnotationIntrospector1;->AudioAttributesCompatParcelizer(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x0

    .line 677
    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_2b

    .line 679
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 680
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V
    :try_end_2b
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_2b} :catch_72
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_2b} :catch_5c
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_2b} :catch_44
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_2b} :catch_2c

    :cond_2b
    return-object p0

    :catch_2c
    move-exception p0

    .line 695
    new-instance p2, Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": calling Fragment constructor caused an exception"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_44
    move-exception p0

    .line 692
    new-instance p2, Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": could not find Fragment constructor"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_5c
    move-exception p0

    .line 688
    new-instance p2, Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_72
    move-exception p0

    .line 684
    new-instance p2, Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method private prepareCallInternal(Lo/accessaddObserverForBackInvoker;Lo/setVisibility;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/accessaddObserverForBackInvoker<",
            "TI;TO;>;",
            "Lo/setVisibility<",
            "Ljava/lang/Void;",
            "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;",
            ">;",
            "Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<",
            "TO;>;)",
            "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<",
            "TI;>;"
        }
    .end annotation

    .line 3608
    iget v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1e

    .line 3614
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 3620
    new-instance v1, Landroidx/fragment/app/Fragment$10;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p2

    move-object v5, v0

    move-object v6, p1

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Landroidx/fragment/app/Fragment$10;-><init>(Landroidx/fragment/app/Fragment;Lo/setVisibility;Ljava/util/concurrent/atomic/AtomicReference;Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)V

    invoke-direct {p0, v1}, Landroidx/fragment/app/Fragment;->registerOnPreAttachListener(Landroidx/fragment/app/Fragment$IconCompatParcelizer;)V

    .line 3629
    new-instance p2, Landroidx/fragment/app/Fragment$3;

    invoke-direct {p2, p0, v0, p1}, Landroidx/fragment/app/Fragment$3;-><init>(Landroidx/fragment/app/Fragment;Ljava/util/concurrent/atomic/AtomicReference;Lo/accessaddObserverForBackInvoker;)V

    return-object p2

    .line 3609
    :cond_1e
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private registerOnPreAttachListener(Landroidx/fragment/app/Fragment$IconCompatParcelizer;)V
    .registers 3

    .line 3658
    iget v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    if-ltz v0, :cond_8

    .line 3659
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    return-void

    .line 3662
    :cond_8
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private restoreViewState()V
    .registers 4

    const/4 v0, 0x3

    .line 3172
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 3173
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "moveto RESTORE_VIEW_STATE: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3175
    :cond_1a
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_2e

    .line 3177
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_2a

    .line 3178
    const-string v2, "savedInstanceState"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_2b

    :cond_2a
    move-object v0, v1

    .line 3181
    :goto_2b
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->restoreViewState(Landroid/os/Bundle;)V

    .line 3183
    :cond_2e
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method callStartTransitionListener(Z)V
    .registers 4

    .line 2912
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-eqz v0, :cond_7

    const/4 v1, 0x0

    .line 2913
    iput-boolean v1, v0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplBaseParcelizer:Z

    .line 2915
    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_3a

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_3a

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v1, :cond_3a

    .line 2918
    invoke-static {v0, v1}, Lo/_renameUsing;->read(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Lo/_renameUsing;

    move-result-object v0

    .line 2919
    invoke-virtual {v0}, Lo/_renameUsing;->AudioAttributesImplApi26Parcelizer()V

    if-eqz p1, :cond_2b

    .line 2924
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p1}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object p1

    new-instance v1, Landroidx/fragment/app/Fragment$1;

    invoke-direct {v1, p0, v0}, Landroidx/fragment/app/Fragment$1;-><init>(Landroidx/fragment/app/Fragment;Lo/_renameUsing;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2e

    .line 2934
    :cond_2b
    invoke-virtual {v0}, Lo/_renameUsing;->read()V

    .line 2936
    :goto_2e
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mPostponedHandler:Landroid/os/Handler;

    if-eqz p1, :cond_3a

    .line 2937
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    .line 2938
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mPostponedHandler:Landroid/os/Handler;

    :cond_3a
    return-void
.end method

.method public createFragmentContainer()Lo/getAlwaysAsId;
    .registers 2

    .line 3049
    new-instance v0, Landroidx/fragment/app/Fragment$7;

    invoke-direct {v0, p0}, Landroidx/fragment/app/Fragment$7;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .registers 7

    .line 2955
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2956
    iget v0, p0, Landroidx/fragment/app/Fragment;->mFragmentId:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2957
    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2958
    iget v0, p0, Landroidx/fragment/app/Fragment;->mContainerId:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2959
    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2960
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 2961
    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2962
    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->mBackStackNesting:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 2963
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mAdded:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 2964
    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mRemoving:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 2965
    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mFromLayout:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 2966
    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mInLayout:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 2967
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 2968
    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mDetached:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 2969
    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 2970
    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 2971
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mRetainInstance:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 2972
    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 2973
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_c8

    .line 2974
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2975
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2977
    :cond_c8
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_d9

    .line 2978
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2979
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2981
    :cond_d9
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mParentFragment:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_ea

    .line 2982
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2983
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mParentFragment:Landroidx/fragment/app/Fragment;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2985
    :cond_ea
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mArguments:Landroid/os/Bundle;

    if-eqz v0, :cond_fb

    .line 2986
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mArguments:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2988
    :cond_fb
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_10c

    .line 2989
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2990
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2992
    :cond_10c
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;

    if-eqz v0, :cond_11d

    .line 2993
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2994
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2996
    :cond_11d
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedViewRegistryState:Landroid/os/Bundle;

    if-eqz v0, :cond_12e

    .line 2997
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewRegistryState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2998
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedViewRegistryState:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_12e
    const/4 v0, 0x0

    .line 3000
    invoke-direct {p0, v0}, Landroidx/fragment/app/Fragment;->getTargetFragment(Z)Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_14a

    .line 3002
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mTarget="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 3003
    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3004
    iget v0, p0, Landroidx/fragment/app/Fragment;->mTargetRequestCode:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 3006
    :cond_14a
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopDirection="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getPopDirection()Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 3007
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getEnterAnim()I

    move-result v0

    if-eqz v0, :cond_16e

    .line 3008
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getEnterAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 3010
    :cond_16e
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getExitAnim()I

    move-result v0

    if-eqz v0, :cond_183

    .line 3011
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getExitAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 3013
    :cond_183
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getPopEnterAnim()I

    move-result v0

    if-eqz v0, :cond_198

    .line 3014
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3015
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getPopEnterAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 3017
    :cond_198
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getPopExitAnim()I

    move-result v0

    if-eqz v0, :cond_1ad

    .line 3018
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getPopExitAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 3020
    :cond_1ad
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1be

    .line 3021
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 3023
    :cond_1be
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_1cf

    .line 3024
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 3026
    :cond_1cf
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getAnimatingAway()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1e4

    .line 3027
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3028
    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3029
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getAnimatingAway()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 3031
    :cond_1e4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1f1

    .line 3032
    invoke-static {p0}, Lo/JsonAnyFormatVisitor;->RemoteActionCompatParcelizer(Lo/hasGetter;)Lo/JsonAnyFormatVisitor;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/JsonAnyFormatVisitor;->write(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 3034
    :cond_1f1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3035
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Child "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 3036
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "  "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/FragmentManager;->write(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 2

    .line 725
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public findFragmentByWho(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .registers 3

    .line 3041
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-object p0

    .line 3044
    :cond_9
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->read(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method generateActivityResultKey()Ljava/lang/String;
    .registers 3

    .line 3668
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "fragment_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_rq#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final getActivity()Lo/maybeGetTypeVariable;
    .registers 1

    .line 991
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    invoke-virtual {p0}, Lo/pessimisticallyValidateBounds;->IconCompatParcelizer()Landroid/app/Activity;

    move-result-object p0

    check-cast p0, Lo/maybeGetTypeVariable;

    return-object p0
.end method

.method public getAllowEnterTransitionOverlap()Z
    .registers 2

    .line 2772
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-eqz v0, :cond_12

    iget-object v0, v0, Landroidx/fragment/app/Fragment$write;->read:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    goto :goto_12

    .line 2773
    :cond_9
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->read:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_12
    :goto_12
    const/4 p0, 0x1

    return p0
.end method

.method public getAllowReturnTransitionOverlap()Z
    .registers 2

    .line 2797
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-eqz v0, :cond_12

    iget-object v0, v0, Landroidx/fragment/app/Fragment$write;->AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    goto :goto_12

    .line 2798
    :cond_9
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_12
    :goto_12
    const/4 p0, 0x1

    return p0
.end method

.method getAnimatingAway()Landroid/view/View;
    .registers 1

    .line 3527
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 3530
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->IconCompatParcelizer:Landroid/view/View;

    return-object p0
.end method

.method public final getArguments()Landroid/os/Bundle;
    .registers 1

    .line 795
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mArguments:Landroid/os/Bundle;

    return-object p0
.end method

.method public final getChildFragmentManager()Landroidx/fragment/app/FragmentManager;
    .registers 4

    .line 1151
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_7

    .line 1154
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    return-object p0

    .line 1152
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " has not been attached yet."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getContext()Landroid/content/Context;
    .registers 1

    .line 964
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    invoke-virtual {p0}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public getDefaultViewModelCreationExtras()Lo/withFieldVisibility;
    .registers 4

    .line 488
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 489
    :goto_8
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1a

    .line 490
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_13

    .line 491
    check-cast v0, Landroid/app/Application;

    goto :goto_1b

    .line 494
    :cond_13
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_8

    :cond_1a
    const/4 v0, 0x0

    :goto_1b
    if-nez v0, :cond_44

    const/4 v1, 0x3

    .line 496
    invoke-static {v1}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v1

    if-eqz v1, :cond_44

    .line 497
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not find Application instance from Context "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 498
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 497
    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 502
    :cond_44
    new-instance v1, Lo/_defaultOrOverride;

    invoke-direct {v1}, Lo/_defaultOrOverride;-><init>()V

    if-eqz v0, :cond_50

    .line 504
    sget-object v2, Lo/VisibilityChecker$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lo/withFieldVisibility$read;

    invoke-virtual {v1, v2, v0}, Lo/_defaultOrOverride;->AudioAttributesCompatParcelizer(Lo/withFieldVisibility$read;Ljava/lang/Object;)V

    .line 506
    :cond_50
    sget-object v0, Lo/withoutIgnored;->read:Lo/withFieldVisibility$read;

    invoke-virtual {v1, v0, p0}, Lo/_defaultOrOverride;->AudioAttributesCompatParcelizer(Lo/withFieldVisibility$read;Ljava/lang/Object;)V

    .line 507
    sget-object v0, Lo/withoutIgnored;->AudioAttributesCompatParcelizer:Lo/withFieldVisibility$read;

    invoke-virtual {v1, v0, p0}, Lo/_defaultOrOverride;->AudioAttributesCompatParcelizer(Lo/withFieldVisibility$read;Ljava/lang/Object;)V

    .line 508
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_69

    .line 509
    sget-object v0, Lo/withoutIgnored;->write:Lo/withFieldVisibility$read;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v1, v0, p0}, Lo/_defaultOrOverride;->AudioAttributesCompatParcelizer(Lo/withFieldVisibility$read;Ljava/lang/Object;)V

    :cond_69
    return-object v1
.end method

.method public getDefaultViewModelProviderFactory()Lo/VisibilityChecker$RemoteActionCompatParcelizer;
    .registers 4

    .line 449
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_5a

    .line 452
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mDefaultFactory:Lo/VisibilityChecker$RemoteActionCompatParcelizer;

    if-nez v0, :cond_57

    .line 454
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 455
    :goto_10
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_22

    .line 456
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_1b

    .line 457
    check-cast v0, Landroid/app/Application;

    goto :goto_23

    .line 460
    :cond_1b
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_10

    :cond_22
    const/4 v0, 0x0

    :goto_23
    if-nez v0, :cond_4c

    const/4 v1, 0x3

    .line 462
    invoke-static {v1}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v1

    if-eqz v1, :cond_4c

    .line 463
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not find Application instance from Context "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 464
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 463
    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 471
    :cond_4c
    new-instance v1, Lo/next;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v0, p0, v2}, Lo/next;-><init>(Landroid/app/Application;Lo/PieChart;Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mDefaultFactory:Lo/VisibilityChecker$RemoteActionCompatParcelizer;

    .line 473
    :cond_57
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mDefaultFactory:Lo/VisibilityChecker$RemoteActionCompatParcelizer;

    return-object p0

    .line 450
    :cond_5a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Can\'t access ViewModels from detached fragment"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public getEnterAnim()I
    .registers 1

    .line 3430
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 3433
    :cond_6
    iget p0, p0, Landroidx/fragment/app/Fragment$write;->RemoteActionCompatParcelizer:I

    return p0
.end method

.method public getEnterTransition()Ljava/lang/Object;
    .registers 1

    .line 2555
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 2558
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->write:Ljava/lang/Object;

    return-object p0
.end method

.method public getEnterTransitionCallback()Lo/_intOverflow;
    .registers 1

    .line 3513
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 3516
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatItemReceiver:Lo/_intOverflow;

    return-object p0
.end method

.method public getExitAnim()I
    .registers 1

    .line 3438
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 3441
    :cond_6
    iget p0, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplApi26Parcelizer:I

    return p0
.end method

.method public getExitTransition()Ljava/lang/Object;
    .registers 1

    .line 2634
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 2637
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    return-object p0
.end method

.method public getExitTransitionCallback()Lo/_intOverflow;
    .registers 1

    .line 3520
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 3523
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplApi21Parcelizer:Lo/_intOverflow;

    return-object p0
.end method

.method public getFocusedView()Landroid/view/View;
    .registers 1

    .line 3549
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 3552
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->RatingCompat:Landroid/view/View;

    return-object p0
.end method

.method public final getFragmentManager()Landroidx/fragment/app/FragmentManager;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1098
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    return-object p0
.end method

.method public final getHost()Ljava/lang/Object;
    .registers 1

    .line 1018
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    invoke-virtual {p0}, Lo/pessimisticallyValidateBounds;->write()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final getId()I
    .registers 1

    .line 764
    iget p0, p0, Landroidx/fragment/app/Fragment;->mFragmentId:I

    return p0
.end method

.method public final getLayoutInflater()Landroid/view/LayoutInflater;
    .registers 2

    .line 1744
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mLayoutInflater:Landroid/view/LayoutInflater;

    if-nez v0, :cond_a

    const/4 v0, 0x0

    .line 1745
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p0

    return-object p0

    :cond_a
    return-object v0
.end method

.method public getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1777
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz p1, :cond_12

    .line 1781
    invoke-virtual {p1}, Lo/pessimisticallyValidateBounds;->RemoteActionCompatParcelizer()Landroid/view/LayoutInflater;

    move-result-object p1

    .line 1782
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onMediaButtonEvent()Landroid/view/LayoutInflater$Factory2;

    move-result-object p0

    invoke-static {p1, p0}, Lo/UntypedObjectDeserializer;->read(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    .line 1778
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public getLifecycle()Lo/anyIgnorals;
    .registers 1

    .line 348
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    return-object p0
.end method

.method public getLoaderManager()Lo/JsonAnyFormatVisitor;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1433
    invoke-static {p0}, Lo/JsonAnyFormatVisitor;->RemoteActionCompatParcelizer(Lo/hasGetter;)Lo/JsonAnyFormatVisitor;

    move-result-object p0

    return-object p0
.end method

.method public getNextTransition()I
    .registers 1

    .line 3475
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 3478
    :cond_6
    iget p0, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatMediaItem:I

    return p0
.end method

.method public final getParentFragment()Landroidx/fragment/app/Fragment;
    .registers 1

    .line 1163
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mParentFragment:Landroidx/fragment/app/Fragment;

    return-object p0
.end method

.method public final getParentFragmentManager()Landroidx/fragment/app/FragmentManager;
    .registers 4

    .line 1115
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_5

    return-object v0

    .line 1117
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " not associated with a fragment manager."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method getPopDirection()Z
    .registers 1

    .line 3461
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 3464
    :cond_6
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment$write;->MediaMetadataCompat:Z

    return p0
.end method

.method public getPopEnterAnim()I
    .registers 1

    .line 3446
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 3449
    :cond_6
    iget p0, p0, Landroidx/fragment/app/Fragment$write;->MediaDescriptionCompat:I

    return p0
.end method

.method public getPopExitAnim()I
    .registers 1

    .line 3454
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 3457
    :cond_6
    iget p0, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatSearchResultReceiver:I

    return p0
.end method

.method public getPostOnViewCreatedAlpha()F
    .registers 1

    .line 3538
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_7

    const/high16 p0, 0x3f800000    # 1.0f

    return p0

    .line 3541
    :cond_7
    iget p0, p0, Landroidx/fragment/app/Fragment$write;->onCommand:F

    return p0
.end method

.method public getReenterTransition()Ljava/lang/Object;
    .registers 3

    .line 2672
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 2675
    :cond_6
    iget-object v0, v0, Landroidx/fragment/app/Fragment$write;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_11

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getExitTransition()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 2676
    :cond_11
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/lang/Object;

    return-object p0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .registers 1

    .line 1041
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method

.method public final getRetainInstance()Z
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1329
    invoke-static {p0}, Lo/getJsonValueAccessor;->RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;)V

    .line 1330
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment;->mRetainInstance:Z

    return p0
.end method

.method public getReturnTransition()Ljava/lang/Object;
    .registers 3

    .line 2594
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 2597
    :cond_6
    iget-object v0, v0, Landroidx/fragment/app/Fragment$write;->onAddQueueItem:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_11

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getEnterTransition()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 2598
    :cond_11
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->onAddQueueItem:Ljava/lang/Object;

    return-object p0
.end method

.method public final getSavedStateRegistry()Lo/setOnChartValueSelectedListener;
    .registers 1

    .line 517
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mSavedStateRegistryController:Lo/setRenderer;

    invoke-virtual {p0}, Lo/setRenderer;->read()Lo/setOnChartValueSelectedListener;

    move-result-object p0

    return-object p0
.end method

.method public getSharedElementEnterTransition()Ljava/lang/Object;
    .registers 1

    .line 2705
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 2708
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->onCustomAction:Ljava/lang/Object;

    return-object p0
.end method

.method public getSharedElementReturnTransition()Ljava/lang/Object;
    .registers 3

    .line 2743
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 2746
    :cond_6
    iget-object v0, v0, Landroidx/fragment/app/Fragment$write;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_11

    .line 2747
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getSharedElementEnterTransition()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 2748
    :cond_11
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/Object;

    return-object p0
.end method

.method public getSharedElementSourceNames()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3491
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-eqz v0, :cond_e

    iget-object v0, v0, Landroidx/fragment/app/Fragment$write;->onPlayFromMediaId:Ljava/util/ArrayList;

    if-nez v0, :cond_9

    goto :goto_e

    .line 3494
    :cond_9
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->onPlayFromMediaId:Ljava/util/ArrayList;

    return-object p0

    .line 3492
    :cond_e
    :goto_e
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public getSharedElementTargetNames()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3499
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-eqz v0, :cond_e

    iget-object v0, v0, Landroidx/fragment/app/Fragment$write;->onPause:Ljava/util/ArrayList;

    if-nez v0, :cond_9

    goto :goto_e

    .line 3502
    :cond_9
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iget-object p0, p0, Landroidx/fragment/app/Fragment$write;->onPause:Ljava/util/ArrayList;

    return-object p0

    .line 3500
    :cond_e
    :goto_e
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public final getString(I)Ljava/lang/String;
    .registers 2

    .line 1063
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .registers 3

    .line 1076
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final getTag()Ljava/lang/String;
    .registers 1

    .line 772
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    return-object p0
.end method

.method public final getTargetFragment()Landroidx/fragment/app/Fragment;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 918
    invoke-direct {p0, v0}, Landroidx/fragment/app/Fragment;->getTargetFragment(Z)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method public final getTargetRequestCode()I
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 953
    invoke-static {p0}, Lo/getJsonValueAccessor;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/Fragment;)V

    .line 954
    iget p0, p0, Landroidx/fragment/app/Fragment;->mTargetRequestCode:I

    return p0
.end method

.method public final getText(I)Ljava/lang/CharSequence;
    .registers 2

    .line 1052
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public getUserVisibleHint()Z
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1421
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    return p0
.end method

.method public getView()Landroid/view/View;
    .registers 1

    .line 2054
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    return-object p0
.end method

.method public getViewLifecycleOwner()Lo/hasGetter;
    .registers 4

    .line 389
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    if-eqz v0, :cond_5

    return-object v0

    .line 390
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t access the Fragment View\'s LifecycleOwner for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " when getView() is null i.e., before onCreateView() or after onDestroyView()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getViewLifecycleOwnerLiveData()Lo/removeIgnored;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/removeIgnored<",
            "Lo/hasGetter;",
            ">;"
        }
    .end annotation

    .line 411
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwnerLiveData:Lo/POJOPropertyBuilder2;

    return-object p0
.end method

.method public getViewModelStore()Lo/hasMixIns;
    .registers 3

    .line 427
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_1f

    .line 430
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->getMinimumMaxLifecycleState()I

    move-result v0

    sget-object v1, Lo/anyIgnorals$write;->IconCompatParcelizer:Lo/anyIgnorals$write;

    invoke-virtual {v1}, Lo/anyIgnorals$write;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_17

    .line 435
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver(Landroidx/fragment/app/Fragment;)Lo/hasMixIns;

    move-result-object p0

    return-object p0

    .line 431
    :cond_17
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 428
    :cond_1f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Can\'t access ViewModels from detached fragment"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final hasOptionsMenu()Z
    .registers 1

    .line 1259
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    return p0
.end method

.method public final hashCode()I
    .registers 1

    .line 732
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public initState()V
    .registers 4

    .line 2268
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->initLifecycle()V

    .line 2269
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mPreviousWho:Ljava/lang/String;

    .line 2270
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    const/4 v0, 0x0

    .line 2271
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 2272
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 2273
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mFromLayout:Z

    .line 2274
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mInLayout:Z

    .line 2275
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mRestored:Z

    .line 2276
    iput v0, p0, Landroidx/fragment/app/Fragment;->mBackStackNesting:I

    const/4 v1, 0x0

    .line 2277
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 2278
    new-instance v2, Lo/_checkRenameByField;

    invoke-direct {v2}, Lo/_checkRenameByField;-><init>()V

    iput-object v2, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 2279
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    .line 2280
    iput v0, p0, Landroidx/fragment/app/Fragment;->mFragmentId:I

    .line 2281
    iput v0, p0, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 2282
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    .line 2283
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 2284
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mDetached:Z

    return-void
.end method

.method public final isAdded()Z
    .registers 2

    .line 1193
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_a

    iget-boolean p0, p0, Landroidx/fragment/app/Fragment;->mAdded:Z

    if-eqz p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public final isDetached()Z
    .registers 1

    .line 1202
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment;->mDetached:Z

    return p0
.end method

.method public final isHidden()Z
    .registers 2

    .line 1252
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_11

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mParentFragment:Landroidx/fragment/app/Fragment;

    .line 1253
    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi26Parcelizer(Landroidx/fragment/app/Fragment;)Z

    move-result p0

    if-eqz p0, :cond_11

    goto :goto_13

    :cond_11
    const/4 p0, 0x0

    return p0

    :cond_13
    :goto_13
    const/4 p0, 0x1

    return p0
.end method

.method public final isInBackStack()Z
    .registers 1

    .line 718
    iget p0, p0, Landroidx/fragment/app/Fragment;->mBackStackNesting:I

    if-lez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final isInLayout()Z
    .registers 1

    .line 1222
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment;->mInLayout:Z

    return p0
.end method

.method public final isMenuVisible()Z
    .registers 2

    .line 1264
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    if-eqz v0, :cond_12

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_10

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mParentFragment:Landroidx/fragment/app/Fragment;

    .line 1265
    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentManager;->RatingCompat(Landroidx/fragment/app/Fragment;)Z

    move-result p0

    if-eqz p0, :cond_12

    :cond_10
    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method public isPostponed()Z
    .registers 1

    .line 3556
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 3559
    :cond_6
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplBaseParcelizer:Z

    return p0
.end method

.method public final isRemoving()Z
    .registers 1

    .line 1211
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment;->mRemoving:Z

    return p0
.end method

.method public final isResumed()Z
    .registers 2

    .line 1230
    iget p0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v0, 0x7

    if-lt p0, v0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public final isStateSaved()Z
    .registers 1

    .line 822
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 825
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch()Z

    move-result p0

    return p0
.end method

.method public final isVisible()Z
    .registers 2

    .line 1239
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isHidden()Z

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_20

    .line 1240
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_20

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_20
    const/4 p0, 0x0

    return p0
.end method

.method public synthetic lambda$performCreateView$0$androidx-fragment-app-Fragment()V
    .registers 3

    .line 3116
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mSavedViewRegistryState:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lo/_renameWithWrappers;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    .line 3117
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedViewRegistryState:Landroid/os/Bundle;

    return-void
.end method

.method noteStateNotSaved()V
    .registers 1

    .line 3223
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onSeekTo()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 2100
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .registers 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x2

    .line 1585
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 1586
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " received the following in onActivityResult(): requestCode: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " resultCode: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " data: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "FragmentManager"

    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_32
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 1903
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .registers 3

    const/4 p1, 0x1

    .line 1884
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 1885
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-nez p1, :cond_9

    const/4 p1, 0x0

    goto :goto_d

    :cond_9
    invoke-virtual {p1}, Lo/pessimisticallyValidateBounds;->IconCompatParcelizer()Landroid/app/Activity;

    move-result-object p1

    :goto_d
    if-eqz p1, :cond_15

    const/4 v0, 0x0

    .line 1887
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 1888
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/app/Activity;)V

    :cond_15
    return-void
.end method

.method public onAttachFragment(Landroidx/fragment/app/Fragment;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    const/4 p1, 0x1

    .line 2189
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    const/4 p1, 0x1

    .line 1971
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 1972
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->restoreChildFragmentState()V

    .line 1973
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(I)Z

    move-result p1

    if-nez p1, :cond_13

    .line 1974
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver()V

    :cond_13
    return-void
.end method

.method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
    .registers 4

    const/4 p0, 0x0

    return-object p0
.end method

.method public onCreateAnimator(IZI)Landroid/animation/Animator;
    .registers 4

    const/4 p0, 0x0

    return-object p0
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .registers 4

    .line 2454
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Lo/maybeGetTypeVariable;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lo/maybeGetTypeVariable;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    .line 2026
    iget p0, p0, Landroidx/fragment/app/Fragment;->mContentLayoutId:I

    if-eqz p0, :cond_a

    const/4 p3, 0x0

    .line 2027
    invoke-virtual {p1, p0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_a
    const/4 p0, 0x0

    return-object p0
.end method

.method public onDestroy()V
    .registers 2

    const/4 v0, 0x1

    .line 2258
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onDestroyOptionsMenu()V
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onDestroyView()V
    .registers 2

    const/4 v0, 0x1

    .line 2248
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onDetach()V
    .registers 2

    const/4 v0, 0x1

    .line 2294
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .registers 2

    .line 1728
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p0

    return-object p0
.end method

.method public onHiddenChanged(Z)V
    .registers 2

    return-void
.end method

.method public onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 1852
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .registers 5

    const/4 p1, 0x1

    .line 1832
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 1833
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-nez p1, :cond_9

    const/4 p1, 0x0

    goto :goto_d

    :cond_9
    invoke-virtual {p1}, Lo/pessimisticallyValidateBounds;->IconCompatParcelizer()Landroid/app/Activity;

    move-result-object p1

    :goto_d
    if-eqz p1, :cond_15

    const/4 v0, 0x0

    .line 1835
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 1836
    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_15
    return-void
.end method

.method public onLowMemory()V
    .registers 2

    const/4 v0, 0x1

    .line 2233
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onMultiWindowModeChanged(Z)V
    .registers 2

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public onOptionsMenuClosed(Landroid/view/Menu;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onPause()V
    .registers 2

    const/4 v0, 0x1

    .line 2215
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .registers 2

    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onPrimaryNavigationFragmentChanged(Z)V
    .registers 2

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onResume()V
    .registers 2

    const/4 v0, 0x1

    .line 2139
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 2

    return-void
.end method

.method public onStart()V
    .registers 2

    const/4 v0, 0x1

    .line 2127
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onStop()V
    .registers 2

    const/4 v0, 0x1

    .line 2226
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .registers 2

    const/4 p1, 0x1

    .line 2116
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    return-void
.end method

.method public performActivityCreated(Landroid/os/Bundle;)V
    .registers 4

    .line 3158
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onSeekTo()V

    const/4 v0, 0x3

    .line 3159
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v0, 0x0

    .line 3160
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3161
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 3162
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz p1, :cond_1b

    .line 3166
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->restoreViewState()V

    .line 3167
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->read()V

    return-void

    .line 3163
    :cond_1b
    new-instance p1, Lo/getAnyGetterMethod;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onActivityCreated()"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public performAttach()V
    .registers 4

    .line 3068
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment$IconCompatParcelizer;

    .line 3069
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    goto :goto_6

    .line 3071
    :cond_16
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3072
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->createFragmentContainer()Lo/getAlwaysAsId;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/pessimisticallyValidateBounds;Lo/getAlwaysAsId;Landroidx/fragment/app/Fragment;)V

    const/4 v0, 0x0

    .line 3073
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    .line 3074
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3075
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v0}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 3076
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz v0, :cond_43

    .line 3080
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/fragment/app/Fragment;)V

    .line 3081
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->write()V

    return-void

    .line 3077
    :cond_43
    new-instance v0, Lo/getAnyGetterMethod;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onAttach()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method performConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    .line 3246
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method performContextItemSelected(Landroid/view/MenuItem;)Z
    .registers 3

    .line 3299
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    if-nez v0, :cond_13

    .line 3300
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 p0, 0x1

    return p0

    .line 3303
    :cond_c
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Landroid/view/MenuItem;)Z

    move-result p0

    return p0

    :cond_13
    const/4 p0, 0x0

    return p0
.end method

.method public performCreate(Landroid/os/Bundle;)V
    .registers 5

    .line 3085
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onSeekTo()V

    const/4 v0, 0x1

    .line 3086
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v1, 0x0

    .line 3087
    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3088
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    new-instance v2, Landroidx/fragment/app/Fragment$9;

    invoke-direct {v2, p0}, Landroidx/fragment/app/Fragment$9;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v1, v2}, Lo/getSetterUnchecked;->IconCompatParcelizer(Lo/findExplicitNames;)V

    .line 3099
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 3100
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mIsCreated:Z

    .line 3101
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz p1, :cond_26

    .line 3105
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    sget-object p1, Lo/anyIgnorals$read;->ON_CREATE:Lo/anyIgnorals$read;

    invoke-virtual {p0, p1}, Lo/getSetterUnchecked;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    return-void

    .line 3102
    :cond_26
    new-instance p1, Lo/getAnyGetterMethod;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onCreate()"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .registers 5

    .line 3264
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    const/4 v1, 0x0

    if-nez v0, :cond_19

    .line 3265
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    if-eqz v0, :cond_11

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    if-eqz v0, :cond_11

    .line 3267
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    const/4 v1, 0x1

    .line 3269
    :cond_11
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p0

    or-int/2addr p0, v1

    return p0

    :cond_19
    return v1
.end method

.method public performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .registers 7

    .line 3110
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onSeekTo()V

    const/4 v0, 0x1

    .line 3111
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mPerformedCreateView:Z

    .line 3112
    new-instance v0, Lo/_renameWithWrappers;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewModelStore()Lo/hasMixIns;

    move-result-object v1

    new-instance v2, Lo/bindMethodTypeParameters;

    invoke-direct {v2, p0}, Lo/bindMethodTypeParameters;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-direct {v0, p0, v1, v2}, Lo/_renameWithWrappers;-><init>(Landroidx/fragment/app/Fragment;Lo/hasMixIns;Ljava/lang/Runnable;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    .line 3119
    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz p1, :cond_66

    .line 3122
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    invoke-virtual {p1}, Lo/_renameWithWrappers;->RemoteActionCompatParcelizer()V

    const/4 p1, 0x3

    .line 3126
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result p1

    if-eqz p1, :cond_49

    .line 3127
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Setting ViewLifecycleOwner on View "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " for Fragment "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3130
    :cond_49
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    invoke-static {p1, p2}, Lo/isCreatorVisible;->IconCompatParcelizer(Landroid/view/View;Lo/hasGetter;)V

    .line 3131
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    invoke-static {p1, p2}, Lo/isFieldVisible;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/TypeResolutionContext;)V

    .line 3132
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    invoke-static {p1, p2}, Lo/setCenterTextRadiusPercent;->read(Landroid/view/View;Lo/PieChart;)V

    .line 3134
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwnerLiveData:Lo/POJOPropertyBuilder2;

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    invoke-virtual {p1, p0}, Lo/POJOPropertyBuilder2;->IconCompatParcelizer(Ljava/lang/Object;)V

    return-void

    .line 3136
    :cond_66
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    invoke-virtual {p1}, Lo/_renameWithWrappers;->read()Z

    move-result p1

    if-nez p1, :cond_72

    const/4 p1, 0x0

    .line 3140
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    return-void

    .line 3137
    :cond_72
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public performDestroy()V
    .registers 4

    .line 3376
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 3377
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    sget-object v1, Lo/anyIgnorals$read;->ON_DESTROY:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/getSetterUnchecked;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    const/4 v0, 0x0

    .line 3378
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    .line 3379
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3380
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mIsCreated:Z

    .line 3381
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 3382
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz v0, :cond_1b

    return-void

    .line 3383
    :cond_1b
    new-instance v0, Lo/getAnyGetterMethod;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onDestroy()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performDestroyView()V
    .registers 4

    .line 3355
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi26Parcelizer()V

    .line 3356
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_22

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    invoke-virtual {v0}, Lo/_renameWithWrappers;->getLifecycle()Lo/anyIgnorals;

    move-result-object v0

    invoke-virtual {v0}, Lo/anyIgnorals;->read()Lo/anyIgnorals$write;

    move-result-object v0

    sget-object v1, Lo/anyIgnorals$write;->read:Lo/anyIgnorals$write;

    .line 3357
    invoke-virtual {v0, v1}, Lo/anyIgnorals$write;->RemoteActionCompatParcelizer(Lo/anyIgnorals$write;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 3358
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    sget-object v1, Lo/anyIgnorals$read;->ON_DESTROY:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/_renameWithWrappers;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    :cond_22
    const/4 v0, 0x1

    .line 3360
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v0, 0x0

    .line 3361
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3362
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 3363
    iget-boolean v1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz v1, :cond_39

    .line 3371
    invoke-static {p0}, Lo/JsonAnyFormatVisitor;->RemoteActionCompatParcelizer(Lo/hasGetter;)Lo/JsonAnyFormatVisitor;

    move-result-object v1

    invoke-virtual {v1}, Lo/JsonAnyFormatVisitor;->RemoteActionCompatParcelizer()V

    .line 3372
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mPerformedCreateView:Z

    return-void

    .line 3364
    :cond_39
    new-instance v0, Lo/getAnyGetterMethod;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performDetach()V
    .registers 4

    const/4 v0, -0x1

    .line 3389
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v0, 0x0

    .line 3390
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3391
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onDetach()V

    const/4 v0, 0x0

    .line 3392
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mLayoutInflater:Landroid/view/LayoutInflater;

    .line 3393
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz v0, :cond_25

    .line 3401
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onPrepare()Z

    move-result v0

    if-nez v0, :cond_24

    .line 3402
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 3403
    new-instance v0, Lo/_checkRenameByField;

    invoke-direct {v0}, Lo/_checkRenameByField;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    :cond_24
    return-void

    .line 3394
    :cond_25
    new-instance v0, Lo/getAnyGetterMethod;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onDetach()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .registers 2

    .line 1760
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mLayoutInflater:Landroid/view/LayoutInflater;

    return-object p1
.end method

.method performLowMemory()V
    .registers 1

    .line 3250
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onLowMemory()V

    return-void
.end method

.method performMultiWindowModeChanged(Z)V
    .registers 2

    .line 3238
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onMultiWindowModeChanged(Z)V

    return-void
.end method

.method performOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 3

    .line 3287
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    if-nez v0, :cond_1b

    .line 3288
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    if-eqz v0, :cond_14

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    if-eqz v0, :cond_14

    .line 3289
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 p0, 0x1

    return p0

    .line 3293
    :cond_14
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroid/view/MenuItem;)Z

    move-result p0

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

.method performOptionsMenuClosed(Landroid/view/Menu;)V
    .registers 3

    .line 3309
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    if-nez v0, :cond_14

    .line 3310
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    if-eqz v0, :cond_f

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    if-eqz v0, :cond_f

    .line 3311
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onOptionsMenuClosed(Landroid/view/Menu;)V

    .line 3313
    :cond_f
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->write(Landroid/view/Menu;)V

    :cond_14
    return-void
.end method

.method public performPause()V
    .registers 4

    .line 3323
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi21Parcelizer()V

    .line 3324
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_10

    .line 3325
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    sget-object v1, Lo/anyIgnorals$read;->ON_PAUSE:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/_renameWithWrappers;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    .line 3327
    :cond_10
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    sget-object v1, Lo/anyIgnorals$read;->ON_PAUSE:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/getSetterUnchecked;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    const/4 v0, 0x6

    .line 3328
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v0, 0x0

    .line 3329
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3330
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 3331
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz v0, :cond_25

    return-void

    .line 3332
    :cond_25
    new-instance v0, Lo/getAnyGetterMethod;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onPause()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method performPictureInPictureModeChanged(Z)V
    .registers 2

    .line 3242
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onPictureInPictureModeChanged(Z)V

    return-void
.end method

.method performPrepareOptionsMenu(Landroid/view/Menu;)Z
    .registers 4

    .line 3276
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    const/4 v1, 0x0

    if-nez v0, :cond_19

    .line 3277
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    if-eqz v0, :cond_11

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    if-eqz v0, :cond_11

    .line 3279
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onPrepareOptionsMenu(Landroid/view/Menu;)V

    const/4 v1, 0x1

    .line 3281
    :cond_11
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroid/view/Menu;)Z

    move-result p0

    or-int/2addr p0, v1

    return p0

    :cond_19
    return v1
.end method

.method performPrimaryNavigationFragmentChanged()V
    .registers 3

    .line 3227
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    .line 3229
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    if-eqz v1, :cond_12

    .line 3230
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_11

    goto :goto_12

    :cond_11
    return-void

    .line 3231
    :cond_12
    :goto_12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    .line 3232
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->onPrimaryNavigationFragmentChanged(Z)V

    .line 3233
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->RatingCompat()V

    return-void
.end method

.method public performResume()V
    .registers 4

    .line 3206
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onSeekTo()V

    .line 3207
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    const/4 v0, 0x7

    .line 3208
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v0, 0x0

    .line 3209
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3210
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 3211
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz v0, :cond_30

    .line 3215
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    sget-object v1, Lo/anyIgnorals$read;->ON_RESUME:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/getSetterUnchecked;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    .line 3216
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_2a

    .line 3217
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    sget-object v1, Lo/anyIgnorals$read;->ON_RESUME:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/_renameWithWrappers;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    .line 3219
    :cond_2a
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat()V

    return-void

    .line 3212
    :cond_30
    new-instance v0, Lo/getAnyGetterMethod;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onResume()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performSaveInstanceState(Landroid/os/Bundle;)V
    .registers 2

    .line 3318
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public performStart()V
    .registers 4

    .line 3188
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onSeekTo()V

    .line 3189
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    const/4 v0, 0x5

    .line 3190
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v0, 0x0

    .line 3191
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3192
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onStart()V

    .line 3193
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz v0, :cond_30

    .line 3197
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    sget-object v1, Lo/anyIgnorals$read;->ON_START:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/getSetterUnchecked;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    .line 3198
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_2a

    .line 3199
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    sget-object v1, Lo/anyIgnorals$read;->ON_START:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/_renameWithWrappers;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    .line 3201
    :cond_2a
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->MediaMetadataCompat()V

    return-void

    .line 3194
    :cond_30
    new-instance v0, Lo/getAnyGetterMethod;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onStart()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performStop()V
    .registers 4

    .line 3339
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatSearchResultReceiver()V

    .line 3340
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_10

    .line 3341
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    sget-object v1, Lo/anyIgnorals$read;->ON_STOP:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/_renameWithWrappers;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    .line 3343
    :cond_10
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Lo/getSetterUnchecked;

    sget-object v1, Lo/anyIgnorals$read;->ON_STOP:Lo/anyIgnorals$read;

    invoke-virtual {v0, v1}, Lo/getSetterUnchecked;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    const/4 v0, 0x4

    .line 3344
    iput v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    const/4 v0, 0x0

    .line 3345
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 3346
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    .line 3347
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz v0, :cond_25

    return-void

    .line 3348
    :cond_25
    new-instance v0, Lo/getAnyGetterMethod;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onStop()"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performViewCreated()V
    .registers 3

    .line 3148
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_b

    .line 3149
    const-string v1, "savedInstanceState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    .line 3152
    :goto_c
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 3153
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem()V

    return-void
.end method

.method public postponeEnterTransition()V
    .registers 2

    .line 2830
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplBaseParcelizer:Z

    return-void
.end method

.method public final postponeEnterTransition(JLjava/util/concurrent/TimeUnit;)V
    .registers 6

    .line 2862
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplBaseParcelizer:Z

    .line 2863
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mPostponedHandler:Landroid/os/Handler;

    if-eqz v0, :cond_10

    .line 2864
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2866
    :cond_10
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_1f

    .line 2867
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onPlay()Lo/pessimisticallyValidateBounds;

    move-result-object v0

    invoke-virtual {v0}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mPostponedHandler:Landroid/os/Handler;

    goto :goto_2a

    .line 2869
    :cond_1f
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mPostponedHandler:Landroid/os/Handler;

    .line 2871
    :goto_2a
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mPostponedHandler:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2872
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mPostponedHandler:Landroid/os/Handler;

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final registerForActivityResult(Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/accessaddObserverForBackInvoker<",
            "TI;TO;>;",
            "Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<",
            "TO;>;)",
            "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<",
            "TI;>;"
        }
    .end annotation

    .line 3576
    new-instance v0, Landroidx/fragment/app/Fragment$8;

    invoke-direct {v0, p0}, Landroidx/fragment/app/Fragment$8;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-direct {p0, p1, v0, p2}, Landroidx/fragment/app/Fragment;->prepareCallInternal(Lo/accessaddObserverForBackInvoker;Lo/setVisibility;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    move-result-object p0

    return-object p0
.end method

.method public final registerForActivityResult(Lo/accessaddObserverForBackInvoker;Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/accessaddObserverForBackInvoker<",
            "TI;TO;>;",
            "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;",
            "Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<",
            "TO;>;)",
            "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<",
            "TI;>;"
        }
    .end annotation

    .line 3594
    new-instance v0, Landroidx/fragment/app/Fragment$6;

    invoke-direct {v0, p0, p2}, Landroidx/fragment/app/Fragment$6;-><init>(Landroidx/fragment/app/Fragment;Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;)V

    invoke-direct {p0, p1, v0, p3}, Landroidx/fragment/app/Fragment;->prepareCallInternal(Lo/accessaddObserverForBackInvoker;Lo/setVisibility;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    move-result-object p0

    return-object p0
.end method

.method public registerForContextMenu(Landroid/view/View;)V
    .registers 2

    .line 2468
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    return-void
.end method

.method public final requestPermissions([Ljava/lang/String;I)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1659
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_c

    .line 1662
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Landroidx/fragment/app/FragmentManager;->write(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V

    return-void

    .line 1660
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Fragment "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " not attached to Activity"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final requireActivity()Lo/maybeGetTypeVariable;
    .registers 4

    .line 1003
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lo/maybeGetTypeVariable;

    move-result-object v0

    if-eqz v0, :cond_7

    return-object v0

    .line 1005
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " not attached to an activity."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireArguments()Landroid/os/Bundle;
    .registers 4

    .line 806
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_7

    return-object v0

    .line 808
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not have any arguments."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireContext()Landroid/content/Context;
    .registers 4

    .line 975
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_7

    return-object v0

    .line 977
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " not attached to a context."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireFragmentManager()Landroidx/fragment/app/FragmentManager;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1142
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    return-object p0
.end method

.method public final requireHost()Ljava/lang/Object;
    .registers 4

    .line 1029
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getHost()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    return-object v0

    .line 1031
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " not attached to a host."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireParentFragment()Landroidx/fragment/app/Fragment;
    .registers 4

    .line 1175
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_43

    .line 1177
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 1178
    const-string v1, "Fragment "

    if-nez v0, :cond_25

    .line 1179
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not attached to any Fragment or host"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1182
    :cond_25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not a child Fragment, it is directly attached to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1183
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_43
    return-object v0
.end method

.method public final requireView()Landroid/view/View;
    .registers 4

    .line 2065
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_7

    return-object v0

    .line 2067
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public restoreChildFragmentState()V
    .registers 3

    .line 1989
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_16

    .line 1990
    const-string v1, "childFragmentManager"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 1993
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/FragmentManager;->read(Landroid/os/Parcelable;)V

    .line 1994
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver()V

    :cond_16
    return-void
.end method

.method final restoreViewState(Landroid/os/Bundle;)V
    .registers 4

    .line 702
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;

    if-eqz v0, :cond_c

    .line 703
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    const/4 v0, 0x0

    .line 704
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;

    :cond_c
    const/4 v0, 0x0

    .line 706
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    .line 707
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onViewStateRestored(Landroid/os/Bundle;)V

    .line 708
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->mCalled:Z

    if-eqz p1, :cond_22

    .line 712
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz p1, :cond_21

    .line 713
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Lo/_renameWithWrappers;

    sget-object p1, Lo/anyIgnorals$read;->ON_CREATE:Lo/anyIgnorals$read;

    invoke-virtual {p0, p1}, Lo/_renameWithWrappers;->RemoteActionCompatParcelizer(Lo/anyIgnorals$read;)V

    :cond_21
    return-void

    .line 709
    :cond_22
    new-instance p1, Lo/getAnyGetterMethod;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lo/getAnyGetterMethod;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAllowEnterTransitionOverlap(Z)V
    .registers 2

    .line 2760
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->read:Ljava/lang/Boolean;

    return-void
.end method

.method public setAllowReturnTransitionOverlap(Z)V
    .registers 2

    .line 2785
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

    return-void
.end method

.method public setAnimations(IIII)V
    .registers 6

    .line 3419
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez v0, :cond_d

    if-nez p1, :cond_d

    if-nez p2, :cond_d

    if-nez p3, :cond_d

    if-nez p4, :cond_d

    return-void

    .line 3422
    :cond_d
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/Fragment$write;->RemoteActionCompatParcelizer:I

    .line 3423
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p1

    iput p2, p1, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplApi26Parcelizer:I

    .line 3424
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p1

    iput p3, p1, Landroidx/fragment/app/Fragment$write;->MediaDescriptionCompat:I

    .line 3425
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput p4, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatSearchResultReceiver:I

    return-void
.end method

.method public setArguments(Landroid/os/Bundle;)V
    .registers 3

    .line 783
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_13

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isStateSaved()Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_13

    .line 784
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Fragment already added and state has been saved"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 786
    :cond_13
    :goto_13
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mArguments:Landroid/os/Bundle;

    return-void
.end method

.method public setEnterSharedElementCallback(Lo/_intOverflow;)V
    .registers 2

    .line 2513
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatItemReceiver:Lo/_intOverflow;

    return-void
.end method

.method public setEnterTransition(Ljava/lang/Object;)V
    .registers 2

    .line 2541
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->write:Ljava/lang/Object;

    return-void
.end method

.method public setExitSharedElementCallback(Lo/_intOverflow;)V
    .registers 2

    .line 2524
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplApi21Parcelizer:Lo/_intOverflow;

    return-void
.end method

.method public setExitTransition(Ljava/lang/Object;)V
    .registers 2

    .line 2617
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    return-void
.end method

.method public setFocusedView(Landroid/view/View;)V
    .registers 2

    .line 3545
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->RatingCompat:Landroid/view/View;

    return-void
.end method

.method public setHasOptionsMenu(Z)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1347
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    if-eq v0, p1, :cond_17

    .line 1348
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    .line 1349
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_17

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isHidden()Z

    move-result p1

    if-nez p1, :cond_17

    .line 1350
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p0}, Lo/pessimisticallyValidateBounds;->read()V

    :cond_17
    return-void
.end method

.method public setInitialSavedState(Landroidx/fragment/app/Fragment$SavedState;)V
    .registers 3

    .line 837
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_11

    if-eqz p1, :cond_d

    .line 840
    iget-object v0, p1, Landroidx/fragment/app/Fragment$SavedState;->read:Landroid/os/Bundle;

    if-eqz v0, :cond_d

    .line 841
    iget-object p1, p1, Landroidx/fragment/app/Fragment$SavedState;->read:Landroid/os/Bundle;

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    return-void

    .line 838
    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Fragment already added"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setMenuVisibility(Z)V
    .registers 3

    .line 1365
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    if-eq v0, p1, :cond_1b

    .line 1366
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    .line 1367
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isHidden()Z

    move-result p1

    if-nez p1, :cond_1b

    .line 1368
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p0}, Lo/pessimisticallyValidateBounds;->read()V

    :cond_1b
    return-void
.end method

.method public setNextTransition(I)V
    .registers 3

    .line 3482
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez v0, :cond_7

    if-nez p1, :cond_7

    return-void

    .line 3485
    :cond_7
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    .line 3486
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iput p1, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatMediaItem:I

    return-void
.end method

.method public setPopDirection(Z)V
    .registers 3

    .line 3468
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-nez v0, :cond_5

    return-void

    .line 3471
    :cond_5
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment$write;->MediaMetadataCompat:Z

    return-void
.end method

.method public setPostOnViewCreatedAlpha(F)V
    .registers 2

    .line 3534
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput p1, p0, Landroidx/fragment/app/Fragment$write;->onCommand:F

    return-void
.end method

.method public setReenterTransition(Ljava/lang/Object;)V
    .registers 2

    .line 2656
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/lang/Object;

    return-void
.end method

.method public setRetainInstance(Z)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1302
    invoke-static {p0}, Lo/getJsonValueAccessor;->write(Landroidx/fragment/app/Fragment;)V

    .line 1303
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mRetainInstance:Z

    .line 1304
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_13

    if-eqz p1, :cond_f

    .line 1306
    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;)V

    return-void

    .line 1308
    :cond_f
    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat(Landroidx/fragment/app/Fragment;)V

    return-void

    :cond_13
    const/4 p1, 0x1

    .line 1311
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mRetainInstanceChangedWhileDetached:Z

    return-void
.end method

.method public setReturnTransition(Ljava/lang/Object;)V
    .registers 2

    .line 2577
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->onAddQueueItem:Ljava/lang/Object;

    return-void
.end method

.method public setSharedElementEnterTransition(Ljava/lang/Object;)V
    .registers 2

    .line 2691
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->onCustomAction:Ljava/lang/Object;

    return-void
.end method

.method public setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3507
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    .line 3508
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iput-object p1, v0, Landroidx/fragment/app/Fragment$write;->onPlayFromMediaId:Ljava/util/ArrayList;

    .line 3509
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$write;->onPause:Ljava/util/ArrayList;

    return-void
.end method

.method public setSharedElementReturnTransition(Ljava/lang/Object;)V
    .registers 2

    .line 2726
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$write;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/Object;

    return-void
.end method

.method public setTargetFragment(Landroidx/fragment/app/Fragment;I)V
    .registers 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_5

    .line 869
    invoke-static {p0, p1, p2}, Lo/getJsonValueAccessor;->RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V

    .line 875
    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x0

    if-eqz p1, :cond_d

    .line 876
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    goto :goto_e

    :cond_d
    move-object v2, v1

    :goto_e
    if-eqz v0, :cond_2e

    if-eqz v2, :cond_2e

    if-ne v0, v2, :cond_15

    goto :goto_2e

    .line 879
    :cond_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Fragment "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " must share the same FragmentManager to be set as a target fragment"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2e
    :goto_2e
    move-object v0, p1

    :goto_2f
    if-eqz v0, :cond_5e

    .line 885
    invoke-virtual {v0, p0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const/4 v2, 0x0

    .line 884
    invoke-direct {v0, v2}, Landroidx/fragment/app/Fragment;->getTargetFragment(Z)Landroidx/fragment/app/Fragment;

    move-result-object v0

    goto :goto_2f

    .line 886
    :cond_3d
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Setting "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as the target of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " would create a target cycle"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5e
    if-nez p1, :cond_65

    .line 891
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    .line 892
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mTarget:Landroidx/fragment/app/Fragment;

    goto :goto_78

    .line 893
    :cond_65
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_74

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_74

    .line 895
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    .line 896
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mTarget:Landroidx/fragment/app/Fragment;

    goto :goto_78

    .line 899
    :cond_74
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    .line 900
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mTarget:Landroidx/fragment/app/Fragment;

    .line 902
    :goto_78
    iput p2, p0, Landroidx/fragment/app/Fragment;->mTargetRequestCode:I

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .registers 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1397
    invoke-static {p0, p1}, Lo/getJsonValueAccessor;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/Fragment;Z)V

    .line 1398
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    const/4 v1, 0x5

    if-nez v0, :cond_25

    if-eqz p1, :cond_25

    iget v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    if-ge v0, v1, :cond_25

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_25

    .line 1399
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_25

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mIsCreated:Z

    if-eqz v0, :cond_25

    .line 1400
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 1401
    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentManager;->read(Landroidx/fragment/app/Fragment;)Lo/_addSetterMethod;

    move-result-object v2

    .line 1400
    invoke-virtual {v0, v2}, Landroidx/fragment/app/FragmentManager;->read(Lo/_addSetterMethod;)V

    .line 1403
    :cond_25
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    .line 1404
    iget v0, p0, Landroidx/fragment/app/Fragment;->mState:I

    if-ge v0, v1, :cond_2f

    if-nez p1, :cond_2f

    const/4 v0, 0x1

    goto :goto_30

    :cond_2f
    const/4 v0, 0x0

    :goto_30
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 1405
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_3c

    .line 1408
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    :cond_3c
    return-void
.end method

.method public shouldShowRequestPermissionRationale(Ljava/lang/String;)Z
    .registers 2

    .line 1710
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz p0, :cond_9

    .line 1711
    invoke-virtual {p0, p1}, Lo/pessimisticallyValidateBounds;->write(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public startActivity(Landroid/content/Intent;)V
    .registers 3

    const/4 v0, 0x0

    .line 1441
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .registers 5

    .line 1450
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_9

    const/4 v1, -0x1

    .line 1453
    invoke-virtual {v0, p0, p1, v1, p2}, Lo/pessimisticallyValidateBounds;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 1451
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Fragment "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " not attached to Activity"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1479
    invoke-virtual {p0, p1, p2, v0}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .registers 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1507
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_c

    .line 1510
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 1508
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " not attached to Activity"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .registers 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object v1, p0

    .line 1546
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    const-string v2, "Fragment "

    if-eqz v0, :cond_5b

    const/4 v0, 0x2

    .line 1549
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_45

    .line 1550
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " received the following in startIntentSenderForResult() requestCode: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v3, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " IntentSender: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " fillInIntent: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " options: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, p7

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "FragmentManager"

    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4a

    :cond_45
    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object/from16 v8, p7

    .line 1554
    :goto_4a
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v0 .. v8}, Landroidx/fragment/app/FragmentManager;->write(Landroidx/fragment/app/Fragment;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    .line 1547
    :cond_5b
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " not attached to Activity"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public startPostponedEnterTransition()V
    .registers 3

    .line 2886
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$write;

    if-eqz v0, :cond_3c

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object v0

    iget-boolean v0, v0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplBaseParcelizer:Z

    if-nez v0, :cond_d

    goto :goto_3c

    .line 2890
    :cond_d
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-nez v0, :cond_19

    .line 2891
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->ensureAnimationInfo()Landroidx/fragment/app/Fragment$write;

    move-result-object p0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplBaseParcelizer:Z

    return-void

    .line 2892
    :cond_19
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v1}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_38

    .line 2893
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v0}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/Fragment$2;

    invoke-direct {v1, p0}, Landroidx/fragment/app/Fragment$2;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void

    :cond_38
    const/4 v0, 0x1

    .line 2900
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->callStartTransitionListener(Z)V

    :cond_3c
    :goto_3c
    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 738
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 739
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 740
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 741
    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    const-string v1, "} ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    iget v1, p0, Landroidx/fragment/app/Fragment;->mFragmentId:I

    if-eqz v1, :cond_3e

    .line 747
    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    iget v1, p0, Landroidx/fragment/app/Fragment;->mFragmentId:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    :cond_3e
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    if-eqz v1, :cond_4c

    .line 751
    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    :cond_4c
    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 755
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public unregisterForContextMenu(Landroid/view/View;)V
    .registers 2

    const/4 p0, 0x0

    .line 2479
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    return-void
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass1 (androidx.fragment.app.Fragment$1)
.class final Landroidx/fragment/app/Fragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->callStartTransitionListener(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/fragment/app/Fragment;

.field final synthetic read:Lo/_renameUsing;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Lo/_renameUsing;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2924
    iput-object p1, p0, Landroidx/fragment/app/Fragment$1;->RemoteActionCompatParcelizer:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$1;->read:Lo/_renameUsing;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 2927
    iget-object v0, p0, Landroidx/fragment/app/Fragment$1;->read:Lo/_renameUsing;

    invoke-virtual {v0}, Lo/_renameUsing;->AudioAttributesImplBaseParcelizer()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2928
    iget-object p0, p0, Landroidx/fragment/app/Fragment$1;->read:Lo/_renameUsing;

    invoke-virtual {p0}, Lo/_renameUsing;->read()V

    :cond_d
    return-void
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass10 (androidx.fragment.app.Fragment$10)
.class final Landroidx/fragment/app/Fragment$10;
.super Landroidx/fragment/app/Fragment$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->prepareCallInternal(Lo/accessaddObserverForBackInvoker;Lo/setVisibility;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic IconCompatParcelizer:Lo/setVisibility;

.field final synthetic RemoteActionCompatParcelizer:Lo/accessaddObserverForBackInvoker;

.field final synthetic read:Landroidx/fragment/app/Fragment;

.field final synthetic write:Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Lo/setVisibility;Ljava/util/concurrent/atomic/AtomicReference;Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)V
    .registers 6

    .line 3620
    iput-object p1, p0, Landroidx/fragment/app/Fragment$10;->read:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$10;->IconCompatParcelizer:Lo/setVisibility;

    iput-object p3, p0, Landroidx/fragment/app/Fragment$10;->AudioAttributesCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Landroidx/fragment/app/Fragment$10;->RemoteActionCompatParcelizer:Lo/accessaddObserverForBackInvoker;

    iput-object p5, p0, Landroidx/fragment/app/Fragment$10;->write:Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/Fragment$IconCompatParcelizer;-><init>(B)V

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()V
    .registers 6

    .line 3623
    iget-object v0, p0, Landroidx/fragment/app/Fragment$10;->read:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->generateActivityResultKey()Ljava/lang/String;

    move-result-object v0

    .line 3624
    iget-object v1, p0, Landroidx/fragment/app/Fragment$10;->IconCompatParcelizer:Lo/setVisibility;

    invoke-interface {v1}, Lo/setVisibility;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    .line 3625
    iget-object v2, p0, Landroidx/fragment/app/Fragment$10;->AudioAttributesCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Landroidx/fragment/app/Fragment$10;->read:Landroidx/fragment/app/Fragment;

    iget-object v4, p0, Landroidx/fragment/app/Fragment$10;->RemoteActionCompatParcelizer:Lo/accessaddObserverForBackInvoker;

    iget-object p0, p0, Landroidx/fragment/app/Fragment$10;->write:Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    invoke-virtual {v1, v0, v3, v4, p0}, Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;->IconCompatParcelizer(Ljava/lang/String;Lo/hasGetter;Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass2 (androidx.fragment.app.Fragment$2)
.class final Landroidx/fragment/app/Fragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->startPostponedEnterTransition()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 2893
    iput-object p1, p0, Landroidx/fragment/app/Fragment$2;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 2896
    iget-object p0, p0, Landroidx/fragment/app/Fragment$2;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->callStartTransitionListener(Z)V

    return-void
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass3 (androidx.fragment.app.Fragment$3)
.class final Landroidx/fragment/app/Fragment$3;
.super Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->prepareCallInternal(Lo/accessaddObserverForBackInvoker;Lo/setVisibility;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<",
        "TI;>;"
    }
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/fragment/app/Fragment;

.field final synthetic RemoteActionCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic write:Lo/accessaddObserverForBackInvoker;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Ljava/util/concurrent/atomic/AtomicReference;Lo/accessaddObserverForBackInvoker;)V
    .registers 4

    .line 3629
    iput-object p1, p0, Landroidx/fragment/app/Fragment$3;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$3;->RemoteActionCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Landroidx/fragment/app/Fragment$3;->write:Lo/accessaddObserverForBackInvoker;

    invoke-direct {p0}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()V
    .registers 2

    .line 3642
    iget-object p0, p0, Landroidx/fragment/app/Fragment$3;->RemoteActionCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    if-eqz p0, :cond_e

    .line 3644
    invoke-virtual {p0}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;->RemoteActionCompatParcelizer()V

    :cond_e
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Ljava/lang/Object;Lo/_checkFloatToStringCoercion;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;",
            "Lo/_checkFloatToStringCoercion;",
            ")V"
        }
    .end annotation

    .line 3632
    iget-object p0, p0, Landroidx/fragment/app/Fragment$3;->RemoteActionCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    if-eqz p0, :cond_e

    .line 3637
    invoke-virtual {p0, p1, p2}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;->RemoteActionCompatParcelizer(Ljava/lang/Object;Lo/_checkFloatToStringCoercion;)V

    return-void

    .line 3634
    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Operation cannot be started before fragment is in created state"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass4 (androidx.fragment.app.Fragment$4)
.class final Landroidx/fragment/app/Fragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 275
    iput-object p1, p0, Landroidx/fragment/app/Fragment$4;->write:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 278
    iget-object p0, p0, Landroidx/fragment/app/Fragment$4;->write:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->startPostponedEnterTransition()V

    return-void
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass5 (androidx.fragment.app.Fragment$5)
.class final Landroidx/fragment/app/Fragment$5;
.super Landroidx/fragment/app/Fragment$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 325
    iput-object p1, p0, Landroidx/fragment/app/Fragment$5;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/Fragment$IconCompatParcelizer;-><init>(B)V

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 328
    iget-object v0, p0, Landroidx/fragment/app/Fragment$5;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mSavedStateRegistryController:Lo/setRenderer;

    invoke-virtual {v0}, Lo/setRenderer;->write()V

    .line 329
    iget-object v0, p0, Landroidx/fragment/app/Fragment$5;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-static {v0}, Lo/withoutIgnored;->IconCompatParcelizer(Lo/PieChart;)V

    .line 332
    iget-object v0, p0, Landroidx/fragment/app/Fragment$5;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_1d

    .line 333
    iget-object v0, p0, Landroidx/fragment/app/Fragment$5;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "registryState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_1e

    :cond_1d
    const/4 v0, 0x0

    .line 335
    :goto_1e
    iget-object p0, p0, Landroidx/fragment/app/Fragment$5;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mSavedStateRegistryController:Lo/setRenderer;

    invoke-virtual {p0, v0}, Lo/setRenderer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)V

    return-void
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass6 (androidx.fragment.app.Fragment$6)
.class final Landroidx/fragment/app/Fragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/setVisibility;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->registerForActivityResult(Lo/accessaddObserverForBackInvoker;Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/setVisibility<",
        "Ljava/lang/Void;",
        "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

.field final synthetic IconCompatParcelizer:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3594
    iput-object p1, p0, Landroidx/fragment/app/Fragment$6;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$6;->AudioAttributesCompatParcelizer:Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private read()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    .registers 1

    .line 3597
    iget-object p0, p0, Landroidx/fragment/app/Fragment$6;->AudioAttributesCompatParcelizer:Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    return-object p0
.end method


# virtual methods
.method public final synthetic RemoteActionCompatParcelizer()Ljava/lang/Object;
    .registers 1

    .line 3594
    invoke-direct {p0}, Landroidx/fragment/app/Fragment$6;->read()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass7 (androidx.fragment.app.Fragment$7)
.class final Landroidx/fragment/app/Fragment$7;
.super Lo/getAlwaysAsId;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->createFragmentContainer()Lo/getAlwaysAsId;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 3049
    iput-object p1, p0, Landroidx/fragment/app/Fragment$7;->read:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Lo/getAlwaysAsId;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Z
    .registers 1

    .line 3062
    iget-object p0, p0, Landroidx/fragment/app/Fragment$7;->read:Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final read(I)Landroid/view/View;
    .registers 4

    .line 3053
    iget-object v0, p0, Landroidx/fragment/app/Fragment$7;->read:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v0, :cond_f

    .line 3057
    iget-object p0, p0, Landroidx/fragment/app/Fragment$7;->read:Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 3054
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/fragment/app/Fragment$7;->read:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not have a view"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass8 (androidx.fragment.app.Fragment$8)
.class final Landroidx/fragment/app/Fragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/setVisibility;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->registerForActivityResult(Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/setVisibility<",
        "Ljava/lang/Void;",
        "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 3576
    iput-object p1, p0, Landroidx/fragment/app/Fragment$8;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    .registers 2

    .line 3579
    iget-object v0, p0, Landroidx/fragment/app/Fragment$8;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    instance-of v0, v0, Lo/_init_lambda3;

    if-eqz v0, :cond_13

    .line 3580
    iget-object p0, p0, Landroidx/fragment/app/Fragment$8;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    check-cast p0, Lo/_init_lambda3;

    invoke-interface {p0}, Lo/_init_lambda3;->getActivityResultRegistry()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    move-result-object p0

    return-object p0

    .line 3582
    :cond_13
    iget-object p0, p0, Landroidx/fragment/app/Fragment$8;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Lo/maybeGetTypeVariable;

    move-result-object p0

    invoke-virtual {p0}, Lo/MediaBrowserCompatMediaItem;->getActivityResultRegistry()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic RemoteActionCompatParcelizer()Ljava/lang/Object;
    .registers 1

    .line 3576
    invoke-direct {p0}, Landroidx/fragment/app/Fragment$8;->AudioAttributesCompatParcelizer()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.fragment.app.Fragment.AnonymousClass9 (androidx.fragment.app.Fragment$9)
.class final Landroidx/fragment/app/Fragment$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/findAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->performCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 3088
    iput-object p1, p0, Landroidx/fragment/app/Fragment$9;->read:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Lo/hasGetter;Lo/anyIgnorals$read;)V
    .registers 3

    .line 3092
    sget-object p1, Lo/anyIgnorals$read;->ON_STOP:Lo/anyIgnorals$read;

    if-ne p2, p1, :cond_11

    .line 3093
    iget-object p1, p0, Landroidx/fragment/app/Fragment$9;->read:Landroidx/fragment/app/Fragment;

    iget-object p1, p1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz p1, :cond_11

    .line 3094
    iget-object p0, p0, Landroidx/fragment/app/Fragment$9;->read:Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_11
    return-void
.end method

###### Class androidx.fragment.app.Fragment.AudioAttributesCompatParcelizer (androidx.fragment.app.Fragment$AudioAttributesCompatParcelizer)
.class public Landroidx/fragment/app/Fragment$AudioAttributesCompatParcelizer;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .registers 3

    .line 577
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

###### Class androidx.fragment.app.Fragment.IconCompatParcelizer (androidx.fragment.app.Fragment$IconCompatParcelizer)
.class abstract Landroidx/fragment/app/Fragment$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .registers 2

    .line 321
    invoke-direct {p0}, Landroidx/fragment/app/Fragment$IconCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method abstract AudioAttributesCompatParcelizer()V
.end method

###### Class androidx.fragment.app.Fragment.SavedState (androidx.fragment.app.Fragment$SavedState)
.class public Landroidx/fragment/app/Fragment$SavedState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/Fragment$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final read:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 551
    new-instance v0, Landroidx/fragment/app/Fragment$SavedState$1;

    invoke-direct {v0}, Landroidx/fragment/app/Fragment$SavedState$1;-><init>()V

    sput-object v0, Landroidx/fragment/app/Fragment$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .registers 2

    .line 529
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 530
    iput-object p1, p0, Landroidx/fragment/app/Fragment$SavedState;->read:Landroid/os/Bundle;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 3

    .line 533
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 534
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment$SavedState;->read:Landroid/os/Bundle;

    if-eqz p2, :cond_10

    if-eqz p1, :cond_10

    .line 536
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_10
    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 547
    iget-object p0, p0, Landroidx/fragment/app/Fragment$SavedState;->read:Landroid/os/Bundle;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method

###### Class androidx.fragment.app.Fragment.SavedState.AnonymousClass1 (androidx.fragment.app.Fragment$SavedState$1)
.class final Landroidx/fragment/app/Fragment$SavedState$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/fragment/app/Fragment$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 552
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(I)[Landroidx/fragment/app/Fragment$SavedState;
    .registers 1

    .line 565
    new-array p0, p0, [Landroidx/fragment/app/Fragment$SavedState;

    return-object p0
.end method

.method private static read(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/fragment/app/Fragment$SavedState;
    .registers 3

    .line 560
    new-instance v0, Landroidx/fragment/app/Fragment$SavedState;

    invoke-direct {v0, p0, p1}, Landroidx/fragment/app/Fragment$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/fragment/app/Fragment$SavedState;
    .registers 3

    .line 555
    new-instance v0, Landroidx/fragment/app/Fragment$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/Fragment$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 552
    invoke-static {p1}, Landroidx/fragment/app/Fragment$SavedState$1;->write(Landroid/os/Parcel;)Landroidx/fragment/app/Fragment$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 552
    invoke-static {p1, p2}, Landroidx/fragment/app/Fragment$SavedState$1;->read(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/fragment/app/Fragment$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 552
    invoke-static {p1}, Landroidx/fragment/app/Fragment$SavedState$1;->IconCompatParcelizer(I)[Landroidx/fragment/app/Fragment$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.fragment.app.Fragment.write (androidx.fragment.app.Fragment$write)
.class public Landroidx/fragment/app/Fragment$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "write"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

.field AudioAttributesImplApi21Parcelizer:Lo/_intOverflow;

.field public AudioAttributesImplApi26Parcelizer:I

.field AudioAttributesImplBaseParcelizer:Z

.field IconCompatParcelizer:Landroid/view/View;

.field MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

.field MediaBrowserCompatItemReceiver:Lo/_intOverflow;

.field MediaBrowserCompatMediaItem:I

.field public MediaBrowserCompatSearchResultReceiver:I

.field MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/lang/Object;

.field public MediaDescriptionCompat:I

.field MediaMetadataCompat:Z

.field RatingCompat:Landroid/view/View;

.field public RemoteActionCompatParcelizer:I

.field handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/Object;

.field onAddQueueItem:Ljava/lang/Object;

.field onCommand:F

.field onCustomAction:Ljava/lang/Object;

.field onPause:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field onPlayFromMediaId:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field read:Ljava/lang/Boolean;

.field write:Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .registers 3

    .line 3675
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3697
    iput-object v0, p0, Landroidx/fragment/app/Fragment$write;->write:Ljava/lang/Object;

    .line 3698
    sget-object v1, Landroidx/fragment/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/fragment/app/Fragment$write;->onAddQueueItem:Ljava/lang/Object;

    .line 3699
    iput-object v0, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Object;

    .line 3700
    sget-object v1, Landroidx/fragment/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/fragment/app/Fragment$write;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/lang/Object;

    .line 3701
    iput-object v0, p0, Landroidx/fragment/app/Fragment$write;->onCustomAction:Ljava/lang/Object;

    .line 3702
    sget-object v1, Landroidx/fragment/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/fragment/app/Fragment$write;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/Object;

    .line 3706
    iput-object v0, p0, Landroidx/fragment/app/Fragment$write;->MediaBrowserCompatItemReceiver:Lo/_intOverflow;

    .line 3707
    iput-object v0, p0, Landroidx/fragment/app/Fragment$write;->AudioAttributesImplApi21Parcelizer:Lo/_intOverflow;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 3709
    iput v1, p0, Landroidx/fragment/app/Fragment$write;->onCommand:F

    .line 3710
    iput-object v0, p0, Landroidx/fragment/app/Fragment$write;->RatingCompat:Landroid/view/View;

    return-void
.end method

###### Class kotlin.bindMethodTypeParameters (o.bindMethodTypeParameters)
.class public final synthetic Lo/bindMethodTypeParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic read:Landroidx/fragment/app/Fragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/bindMethodTypeParameters;->read:Landroidx/fragment/app/Fragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/bindMethodTypeParameters;->read:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->lambda$performCreateView$0$androidx-fragment-app-Fragment()V

    return-void
.end method
