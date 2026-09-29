###### Class androidx.core.widget.ContentLoadingProgressBar (androidx.core.widget.ContentLoadingProgressBar)
.class public Landroidx/core/widget/ContentLoadingProgressBar;
.super Landroid/widget/ProgressBar;
.source "SourceFile"


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:J

.field private RemoteActionCompatParcelizer:Z

.field private read:Z

.field private final write:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, v0}, Landroidx/core/widget/ContentLoadingProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 p1, -0x1

    .line 40
    iput-wide p1, p0, Landroidx/core/widget/ContentLoadingProgressBar;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 41
    iput-boolean v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->IconCompatParcelizer:Z

    .line 42
    iput-boolean v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->RemoteActionCompatParcelizer:Z

    .line 43
    iput-boolean v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->read:Z

    .line 45
    new-instance p1, Lo/getAnnotations;

    invoke-direct {p1, p0}, Lo/getAnnotations;-><init>(Landroidx/core/widget/ContentLoadingProgressBar;)V

    iput-object p1, p0, Landroidx/core/widget/ContentLoadingProgressBar;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    .line 51
    new-instance p1, Lo/_fields;

    invoke-direct {p1, p0}, Lo/_fields;-><init>(Landroidx/core/widget/ContentLoadingProgressBar;)V

    iput-object p1, p0, Landroidx/core/widget/ContentLoadingProgressBar;->write:Ljava/lang/Runnable;

    return-void
.end method

.method private IconCompatParcelizer()V
    .registers 2

    .line 80
    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 81
    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->write:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final synthetic RemoteActionCompatParcelizer()V
    .registers 3

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->IconCompatParcelizer:Z

    const-wide/16 v0, -0x1

    .line 47
    iput-wide v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->MediaBrowserCompatCustomActionResultReceiver:J

    const/16 v0, 0x8

    .line 48
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onAttachedToWindow()V
    .registers 1

    .line 69
    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    .line 70
    invoke-direct {p0}, Landroidx/core/widget/ContentLoadingProgressBar;->IconCompatParcelizer()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 1

    .line 75
    invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V

    .line 76
    invoke-direct {p0}, Landroidx/core/widget/ContentLoadingProgressBar;->IconCompatParcelizer()V

    return-void
.end method

.method public final synthetic write()V
    .registers 4

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->RemoteActionCompatParcelizer:Z

    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/core/widget/ContentLoadingProgressBar;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 55
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

###### Class kotlin._fields (o._fields)
.class public final synthetic Lo/_fields;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic write:Landroidx/core/widget/ContentLoadingProgressBar;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/widget/ContentLoadingProgressBar;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_fields;->write:Landroidx/core/widget/ContentLoadingProgressBar;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/_fields;->write:Landroidx/core/widget/ContentLoadingProgressBar;

    invoke-virtual {p0}, Landroidx/core/widget/ContentLoadingProgressBar;->write()V

    return-void
.end method

###### Class kotlin.getAnnotations (o.getAnnotations)
.class public final synthetic Lo/getAnnotations;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/core/widget/ContentLoadingProgressBar;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/widget/ContentLoadingProgressBar;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getAnnotations;->IconCompatParcelizer:Landroidx/core/widget/ContentLoadingProgressBar;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getAnnotations;->IconCompatParcelizer:Landroidx/core/widget/ContentLoadingProgressBar;

    invoke-virtual {p0}, Landroidx/core/widget/ContentLoadingProgressBar;->RemoteActionCompatParcelizer()V

    return-void
.end method
