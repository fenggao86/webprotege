package edu.stanford.bmir.protege.web.client.workspace;

import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 11/02/16
 */
public class ApplicationPresenter {

    private final ApplicationView applicationView;

    @Inject
    public ApplicationPresenter(ApplicationView applicationView) {
        this.applicationView = checkNotNull(applicationView);
    }

    public ApplicationView getApplicationView() {
        return applicationView;
    }
}