###### Class androidx.compose.ui.viewinterop.ViewFactoryHolder (androidx.compose.ui.viewinterop.ViewFactoryHolder)
.class public final Landroidx/compose/ui/viewinterop/ViewFactoryHolder;
.super Landroidx/compose/ui/viewinterop/AndroidViewHolder;
.source "SourceFile"

# interfaces
.implements Lo/CoercionConfigs;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        ">",
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "Lo/CoercionConfigs;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013BK\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\n8\u0006\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\'\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R(\u0010%\u001a\u0004\u0018\u00010(2\u0008\u0010\u0006\u001a\u0004\u0018\u00010(8\u0002@CX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010)\"\u0004\u0008#\u0010*RB\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00148\u0007@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100RB\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00148\u0007@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u00081\u0010,\u001a\u0004\u00082\u0010.\"\u0004\u00083\u00100RB\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00148\u0007@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u00084\u0010,\u001a\u0004\u00085\u0010.\"\u0004\u00086\u00100"
    }
    d2 = {
        "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;",
        "Landroid/view/View;",
        "T",
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "Lo/CoercionConfigs;",
        "Landroid/content/Context;",
        "p0",
        "Lo/convertNumberToLong;",
        "p1",
        "p2",
        "Lo/reportBadDefinition;",
        "p3",
        "Lo/JavaBigIntegerFromCharSequence;",
        "p4",
        "",
        "p5",
        "Lo/_configureGenerator;",
        "p6",
        "<init>",
        "(Landroid/content/Context;Lo/convertNumberToLong;Landroid/view/View;Lo/reportBadDefinition;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;)V",
        "Lkotlin/Function1;",
        "(Landroid/content/Context;Lo/getAnswerMap;Lo/convertNumberToLong;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;)V",
        "",
        "MediaBrowserCompatSearchResultReceiver",
        "()V",
        "RatingCompat",
        "MediaBrowserCompatItemReceiver",
        "Landroid/view/View;",
        "IconCompatParcelizer",
        "RemoteActionCompatParcelizer",
        "Lo/reportBadDefinition;",
        "AudioAttributesImplBaseParcelizer",
        "Lo/JavaBigIntegerFromCharSequence;",
        "write",
        "I",
        "read",
        "",
        "MediaBrowserCompatCustomActionResultReceiver",
        "Ljava/lang/String;",
        "AudioAttributesCompatParcelizer",
        "Lo/JavaBigIntegerFromCharSequence$read;",
        "Lo/JavaBigIntegerFromCharSequence$read;",
        "(Lo/JavaBigIntegerFromCharSequence$read;)V",
        "updateBlock",
        "Lo/getAnswerMap;",
        "getUpdateBlock",
        "()Lo/getAnswerMap;",
        "setUpdateBlock",
        "(Lo/getAnswerMap;)V",
        "resetBlock",
        "getResetBlock",
        "setResetBlock",
        "releaseBlock",
        "getReleaseBlock",
        "setReleaseBlock"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AudioAttributesImplBaseParcelizer:Lo/JavaBigIntegerFromCharSequence;

.field private IconCompatParcelizer:Lo/JavaBigIntegerFromCharSequence$read;

.field private final MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private final MediaBrowserCompatItemReceiver:Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final RemoteActionCompatParcelizer:Lo/reportBadDefinition;

.field private releaseBlock:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-TT;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private resetBlock:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-TT;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private updateBlock:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-TT;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final write:I


# direct methods
.method private constructor <init>(Landroid/content/Context;Lo/convertNumberToLong;Landroid/view/View;Lo/reportBadDefinition;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lo/convertNumberToLong;",
            "TT;",
            "Lo/reportBadDefinition;",
            "Lo/JavaBigIntegerFromCharSequence;",
            "I",
            "Lo/_configureGenerator;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p6

    move-object v4, p4

    move-object v5, p3

    move-object v6, p7

    .line 306
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V

    .line 310
    iput-object p3, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    .line 312
    iput-object p4, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->RemoteActionCompatParcelizer:Lo/reportBadDefinition;

    .line 313
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->AudioAttributesImplBaseParcelizer:Lo/JavaBigIntegerFromCharSequence;

    .line 314
    iput p6, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->write:I

    const/4 p1, 0x0

    .line 348
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 349
    invoke-static {p6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    const/4 p2, 0x0

    if-eqz p5, :cond_24

    .line 353
    invoke-interface {p5, p1}, Lo/JavaBigIntegerFromCharSequence;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_25

    :cond_24
    move-object p1, p2

    :goto_25
    instance-of p4, p1, Landroid/util/SparseArray;

    if-eqz p4, :cond_2c

    move-object p2, p1

    check-cast p2, Landroid/util/SparseArray;

    :cond_2c
    if-eqz p2, :cond_31

    .line 354
    invoke-virtual {p3, p2}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 355
    :cond_31
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->MediaBrowserCompatSearchResultReceiver()V

    .line 358
    invoke-static {}, Lo/AtomicLongDeserializer;->RemoteActionCompatParcelizer()Lo/getAnswerMap;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->updateBlock:Lo/getAnswerMap;

    .line 364
    invoke-static {}, Lo/AtomicLongDeserializer;->RemoteActionCompatParcelizer()Lo/getAnswerMap;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->resetBlock:Lo/getAnswerMap;

    .line 370
    invoke-static {}, Lo/AtomicLongDeserializer;->RemoteActionCompatParcelizer()Lo/getAnswerMap;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->releaseBlock:Lo/getAnswerMap;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lo/convertNumberToLong;Landroid/view/View;Lo/reportBadDefinition;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 19

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    move-object v3, v0

    goto :goto_8

    :cond_7
    move-object v3, p2

    :goto_8
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_13

    .line 312
    new-instance v0, Lo/reportBadDefinition;

    invoke-direct {v0}, Lo/reportBadDefinition;-><init>()V

    move-object v5, v0

    goto :goto_14

    :cond_13
    move-object v5, p4

    :goto_14
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    .line 307
    invoke-direct/range {v1 .. v8}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;Landroid/view/View;Lo/reportBadDefinition;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/getAnswerMap;Lo/convertNumberToLong;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;)V
    .registers 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lo/getAnswerMap<",
            "-",
            "Landroid/content/Context;",
            "+TT;>;",
            "Lo/convertNumberToLong;",
            "Lo/JavaBigIntegerFromCharSequence;",
            "I",
            "Lo/_configureGenerator;",
            ")V"
        }
    .end annotation

    move-object v1, p1

    move-object v0, p2

    .line 329
    invoke-interface {p2, p1}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    const/4 v4, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v0, p0

    move-object v2, p3

    move-object v5, p4

    move v6, p5

    move-object/from16 v7, p6

    .line 327
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;Landroid/view/View;Lo/reportBadDefinition;Lo/JavaBigIntegerFromCharSequence;ILo/_configureGenerator;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method private final MediaBrowserCompatSearchResultReceiver()V
    .registers 4

    .line 380
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->AudioAttributesImplBaseParcelizer:Lo/JavaBigIntegerFromCharSequence;

    if-eqz v0, :cond_14

    .line 382
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    new-instance v2, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$2;

    invoke-direct {v2, p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$2;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    check-cast v2, Lo/getCreatedOnDateMs;

    invoke-interface {v0, v1, v2}, Lo/JavaBigIntegerFromCharSequence;->read(Ljava/lang/String;Lo/getCreatedOnDateMs;)Lo/JavaBigIntegerFromCharSequence$read;

    move-result-object v0

    .line 381
    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->read(Lo/JavaBigIntegerFromCharSequence$read;)V

    :cond_14
    return-void
.end method

.method private final RatingCompat()V
    .registers 2

    const/4 v0, 0x0

    .line 389
    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->read(Lo/JavaBigIntegerFromCharSequence$read;)V

    return-void
.end method

.method public static final synthetic read(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V
    .registers 1

    .line 306
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->RatingCompat()V

    return-void
.end method

.method private final read(Lo/JavaBigIntegerFromCharSequence$read;)V
    .registers 3

    .line 343
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->IconCompatParcelizer:Lo/JavaBigIntegerFromCharSequence$read;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lo/JavaBigIntegerFromCharSequence$read;->RemoteActionCompatParcelizer()V

    .line 344
    :cond_7
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->IconCompatParcelizer:Lo/JavaBigIntegerFromCharSequence$read;

    return-void
.end method

.method public static final synthetic write(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)Landroid/view/View;
    .registers 1

    .line 306
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    return-object p0
.end method


# virtual methods
.method public final getReleaseBlock()Lo/getAnswerMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getAnswerMap<",
            "TT;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 370
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->releaseBlock:Lo/getAnswerMap;

    return-object p0
.end method

.method public final getResetBlock()Lo/getAnswerMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getAnswerMap<",
            "TT;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 364
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->resetBlock:Lo/getAnswerMap;

    return-object p0
.end method

.method public final getUpdateBlock()Lo/getAnswerMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getAnswerMap<",
            "TT;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 358
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->updateBlock:Lo/getAnswerMap;

    return-object p0
.end method

.method public final setReleaseBlock(Lo/getAnswerMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getAnswerMap<",
            "-TT;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 372
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->releaseBlock:Lo/getAnswerMap;

    .line 373
    new-instance p1, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$4;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$4;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    check-cast p1, Lo/getCreatedOnDateMs;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->read(Lo/getCreatedOnDateMs;)V

    return-void
.end method

.method public final setResetBlock(Lo/getAnswerMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getAnswerMap<",
            "-TT;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 366
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->resetBlock:Lo/getAnswerMap;

    .line 367
    new-instance p1, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$3;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$3;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    check-cast p1, Lo/getCreatedOnDateMs;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->write(Lo/getCreatedOnDateMs;)V

    return-void
.end method

.method public final setUpdateBlock(Lo/getAnswerMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getAnswerMap<",
            "-TT;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 360
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->updateBlock:Lo/getAnswerMap;

    .line 361
    new-instance p1, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$1;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$1;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    check-cast p1, Lo/getCreatedOnDateMs;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)V

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.ViewFactoryHolder.AnonymousClass1 (androidx.compose.ui.viewinterop.ViewFactoryHolder$1)
.class final Landroidx/compose/ui/viewinterop/ViewFactoryHolder$1;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->setUpdateBlock(Lo/getAnswerMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "read",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/viewinterop/ViewFactoryHolder<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/viewinterop/ViewFactoryHolder<",
            "TT;>;)V"
        }
    .end annotation

    .line 362
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$1;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 361
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$1;->read()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read()V
    .registers 2

    .line 361
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$1;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->write(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)Landroid/view/View;

    move-result-object v0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$1;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->getUpdateBlock()Lo/getAnswerMap;

    move-result-object p0

    invoke-interface {p0, v0}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.ViewFactoryHolder.AnonymousClass2 (androidx.compose.ui.viewinterop.ViewFactoryHolder$2)
.class final Landroidx/compose/ui/viewinterop/ViewFactoryHolder$2;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->MediaBrowserCompatSearchResultReceiver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "()Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/viewinterop/ViewFactoryHolder<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/viewinterop/ViewFactoryHolder<",
            "TT;>;)V"
        }
    .end annotation

    .line 384
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$2;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    .line 383
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$2;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->write(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    return-object v0
.end method

###### Class androidx.compose.ui.viewinterop.ViewFactoryHolder.AnonymousClass3 (androidx.compose.ui.viewinterop.ViewFactoryHolder$3)
.class final Landroidx/compose/ui/viewinterop/ViewFactoryHolder$3;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->setResetBlock(Lo/getAnswerMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "RemoteActionCompatParcelizer",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/viewinterop/ViewFactoryHolder<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/viewinterop/ViewFactoryHolder<",
            "TT;>;)V"
        }
    .end annotation

    .line 368
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$3;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()V
    .registers 2

    .line 367
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$3;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->write(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)Landroid/view/View;

    move-result-object v0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$3;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->getResetBlock()Lo/getAnswerMap;

    move-result-object p0

    invoke-interface {p0, v0}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 367
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$3;->RemoteActionCompatParcelizer()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.ViewFactoryHolder.AnonymousClass4 (androidx.compose.ui.viewinterop.ViewFactoryHolder$4)
.class final Landroidx/compose/ui/viewinterop/ViewFactoryHolder$4;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->setReleaseBlock(Lo/getAnswerMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "read",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/viewinterop/ViewFactoryHolder<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/viewinterop/ViewFactoryHolder<",
            "TT;>;)V"
        }
    .end annotation

    .line 376
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$4;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 373
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$4;->read()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read()V
    .registers 3

    .line 374
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$4;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->write(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$4;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    invoke-virtual {v1}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->getReleaseBlock()Lo/getAnswerMap;

    move-result-object v1

    invoke-interface {v1, v0}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$4;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->read(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    return-void
.end method
